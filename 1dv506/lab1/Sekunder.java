package 1DV506_lab1;

import java.util.Scanner;

public class Sekunder {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Timmar:");
	int timmar =in.nextInt();
	int h = timmar * 3600; // timmar till sekunder
	
	System.out.print("Minuter:");
	int minuter =in.nextInt();
	int min = minuter * 60; // Gör om minuter till sekunder
	
	System.out.print("Sekunder:");
	int sekunder =in.nextInt();
	
	System.out.print("Tid i Sekunder: "+ min + h + sekunder);

	in.close();
	}
}
