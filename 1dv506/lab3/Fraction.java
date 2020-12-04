package 1dv506_lab3;

public class Fraction { 
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this.setNumerator(1);
		this.setDenominator(1);
		this.simple();
	}
	
	public Fraction(int num_in, int den_in) {
		this.setNumerator(num_in);
		this.setDenominator(den_in);
		this.simple();
	}
	
	public Fraction add(Fraction b) {
		int newDenominator = this.denominator * b.denominator;
		int newNumerator = (this.denominator * b.numerator ) + (b.denominator * this.numerator);
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Fraction subtract(Fraction b) {
		int newDenominator = this.denominator * b.denominator;
		int newNumerator  = (this.numerator* b.denominator) - (b.numerator *this.denominator);
		return new Fraction(newNumerator, newDenominator);
	}
	
	public Fraction multiply(Fraction b) {
		return new Fraction(this.numerator *b.numerator ,this.denominator*b.denominator);
	}
	
	public Fraction divide(Fraction b) {
		return new Fraction(this.denominator*b.numerator, this.numerator*b.denominator);
	}
	
	public boolean isEqualTo(Fraction b) {
		if (this.numerator!= b.numerator){ 
			return false;
		}
		if (this.denominator != b.denominator){
			return false;
		}
		return true;
	}
	
	private int sgd(int a, int b) {
		int c;
		while (b != 0) {
			c = a%b;
			a = b;
			b = c;
		}
		return a;
	}

	private void simple() {
		int delare = this.sgd(this.numerator, this.denominator);
		this.numerator= this.numerator/ delare;
		this.denominator = this.denominator / delare;
	}
	
	private void setNumerator(int num_in) {
		this.numerator = num_in;
	}
	private void setDenominator(int den_in) {
		if (den_in == 0) { //Förhindar division med 0
			throw new IllegalArgumentException("Fraction: division with 0 is illegal");
		} else {
			this.denominator = den_in;
		}
	}
	
	
	public void setFraction(int t, int n) {
		this.setNumerator(t);
		this.setDenominator(n);
		this.simple();
	}

	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public boolean isNegative() {
		boolean num_neg = this.numerator != Math.abs(this.numerator);
		boolean den_neg = this.denominator != Math.abs(this.denominator);
		if (num_neg ^ den_neg){ 
		return true;}
		return false;
	}
	public String toString() {
		return "" + this. numerator + "/" + this.denominator;
	}
}
