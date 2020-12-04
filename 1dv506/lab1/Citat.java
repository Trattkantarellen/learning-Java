package 1DV506_lab1;

import java.util.Scanner;

public class Citat {
	public static void main(String[] arg) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Skriv vad du vill: ");
	String citat = in.nextLine();
		
	System.out.print("Citat: " + "\"" + citat + "\"");
	
	in.close();
	}
}
