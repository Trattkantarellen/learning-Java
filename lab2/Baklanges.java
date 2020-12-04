package 1dv506_lab2;

import java.util.Scanner;

public class Baklanges {
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("print a line: ");
		String text = in.nextLine();
		
			for (int i =text.length() -1; i >=0; i--){
				System.out.print(text.charAt(i));
			}
	in.close();
	}
}
