package 1DV506_lab1;

import java.util.Scanner;

public class KortNamn {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("F�rnamn: ");
	String fornamn = in.nextLine();
	
	System.out.print("Efternamn: ");
	String efternamn =in.nextLine() + "   "; // L�ser kortare efternamn som inte har 4 characters
	
	String forn = fornamn.substring(0,1);
	String eftn = efternamn.substring(0,3);
	System.out.print(forn +". " + eftn);
	
	in.close();	
	}
}
