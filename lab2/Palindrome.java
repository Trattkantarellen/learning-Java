package 1dv506_lab2;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Enter text: ");
		String text = in.nextLine();
		String textLow = text.toLowerCase();
		List<Character> text2 = new ArrayList<>();
		List<Character> reverseText = new ArrayList<>();
		
		for(int i = 0; i < textLow.length(); i++){
			if(Character.isLetter(textLow.charAt(i))){
				text2.add(textLow.charAt(i));}
		}
		
		for(int i = text2.size() -1; i >= 0; i--){
			reverseText.add(text2.get(i));
		}
		
		if(reverseText.equals(text2)){
		System.out.println(text + " is a palindrome");
	    }
		
		else if(false == reverseText.equals(text2)){
		System.out.println(text + " is not a palindrome");
		}
	in.close();
	}	
}


