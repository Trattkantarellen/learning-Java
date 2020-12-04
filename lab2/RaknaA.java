package 1dv506_lab2;

import java.util.Scanner;

public class RaknaA {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("print a line: ");
			String text = in.nextLine();
			int na = 0;
			int nA = 0;
			
			for (int i = 0; i < text.length();i++){
				if (text.charAt(i)=='a'){
					na++;
				}
				else if (text.charAt(i)=='A'){
					nA++;
				}
			}	
			in.close();	
			System.out.println("na: " + na);
			System.out.println("nA: " + nA);
}
}
