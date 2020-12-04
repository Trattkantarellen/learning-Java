package 1DV506_lab1;

import java.util.Scanner;

public class Tid {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Totalt antal sekunder:");
	long sek = in.nextLong();
	
	
	
	long tim = sek / 3600;
	System.out.print("Timmar: "+ tim);
	
	long timm = sek % 3600;
	long min = timm / 60;
	System.out.print(" Minuter: " + min);
	
	int sektva = (int) (sek -(tim * 3600  + min * 60)); // tar bort de sekunder som finns i timmar och minuter.
	System.out.print(" Sekunder: " + sektva);
	
	in.close();
	}
}
