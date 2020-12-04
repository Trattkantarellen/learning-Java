package 1DV506_lab1;

import java.util.Scanner;

public class SummaAvTre {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Tresiffrigt tal:");
	int tretal = in.nextInt();
	
	int ental = tretal % 10;
	int tiotal = (tretal / 10) % 10;
	int hundratal = (tretal / 100) % 100;
	
	int summatretal = ental + tiotal + hundratal;
	System.out.print("Summa av tretalet: " + summatretal );
	
	in.close();
	}
}
