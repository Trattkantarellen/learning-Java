package 1dv506_lab3;

public class FractionMain {
	public static void main(String[] args) {
		
		Fraction fraction1 = new Fraction(64,30);
		Fraction fraction2 = new Fraction(10,3);
		System.out.println(fraction1.toString()); // förkortar fraction1 till 32/15
	      
	        // Fyra räknesätt:
	        System.out.println("Fraction1 + Fraction2: " + fraction1.add(fraction2)); // 82/15
	        System.out.println("Fraction1 - Fraction2: " + fraction1.subtract(fraction2)); //blir negativt
	        System.out.println("Fraction1 * Fraction2: " + fraction1.multiply(fraction2)); 
	       System.out.println("Fraction2 / Fraction1: " + fraction2.divide(fraction1));
	       
	      
	       if (fraction1.subtract(fraction2).isNegative()){
	    	   System.out.println(fraction1.subtract(fraction2).toString() + " is negative!"); //
	       }
	
			
	       
			Fraction fraction3 = fraction1.add(fraction2);
			System.out.println("Fraction3: " + fraction3.toString()); // samma som Fraction1 + Fraction2
			
			
			
			Fraction fraction4 = fraction3.multiply(fraction3); 
			System.out.println("Fraction3 * Fraction3: " + fraction4.toString()); 
			
			
			
			if (fraction1.isEqualTo(fraction3)) {
				System.out.println(fraction1.toString() + " = " + fraction3.toString());
			} else {
				System.out.println(fraction1.toString() + " != " + fraction3.toString());
			}
			
			Fraction fraction5 = new Fraction(128, 60); // för att testa om isEqual fungerar med någon som ska vara sant
			if (fraction1.isEqualTo(fraction5)) {
				System.out.println(fraction1.toString() + " = " + fraction5.toString());
			} else {
				System.out.println(fraction1.toString() + " != " + fraction5.toString());
			}
			
			
			
			
			// denna ger exception för division med 0:
			// Fraction fraction6 = new Fraction(1,0);
		}
	    }


