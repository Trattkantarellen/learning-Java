package 1DV506_lab1;

import java.util.Scanner;

import java.lang.Math;

public class VindAvkylning {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
	System.out.print("Ange temperatur (celcius): ");
	double temp = in.nextDouble();
	
	System.out.print("Ange vindhastigheten (m/s): ");
	double hast = in.nextDouble();
	
	double siple = 33 +(temp -33) * (0.474 + 0.454*(Math.sqrt(hast))-0.0454*hast); //Siples formel
	double sipleFinale =  Math.round(siple);
	
	System.out.print("Uplevd kyla: " + sipleFinale + " grader celsius");
	
	in.close();
	}
}
