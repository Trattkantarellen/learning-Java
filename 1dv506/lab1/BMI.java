package 1DV506_lab1;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Din vikt i kilogram:");
	double vikt = in.nextDouble();
	
	System.out.print("Din längd i meter:");
	double längd = in.nextDouble();
	
	double bmi = vikt/(Math.pow(längd,2));
	double bmi2 = Math.round(bmi);
	int bmiFinale = (int) bmi2;
	System.out.println("Ditt BMI-värde är: "+ bmiFinale);
	
	in.close();
	}
}
