package 1DV506_lab1;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Konvertera {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Antalet grader i Farenheit: ");
	double farenheit = in.nextDouble();
	
	double celsius = 5.0 *((farenheit - 32) / 9.0);
	
	
	DecimalFormat celsiusFormat = new DecimalFormat("0.#"); // Avrundar till en decimal
	String grad_endecimal = celsiusFormat.format(celsius);         
	System.out.print("I Celsius (avrundat till en decimal): " + grad_endecimal);
	
	in.close();
	}
}
