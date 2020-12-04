package 1dv506_lab2;

import java.util.Scanner;

import java.util.Random;

public class HighLow{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
		
		int rand1 = rand.nextInt(100) +1;
		int guess = 0;
		int guessnumber = 0;
		int guessnumber2 = guessnumber + 1;
		boolean found = false;
	
	System.out.print("your guess: ");
	guess = in.nextInt();
	
	 	while (found == false && guessnumber<9){
			if (guess == rand1){
				guessnumber2 = guessnumber + 1;
				System.out.print("Correct" + " answer after " + guessnumber2);
				System.out.println("Good work");
				found = true;
		}
			
			else if (guess < rand1){
				System.out.print("Higher, new guess: ");
			}
			
			else if (guess > rand1){
				System.out.print("Lower, new guess: ");
			} 
			
			guessnumber++;
			guess = in.nextInt();
		}
	 	
	 	if(found == !true){
	 		System.out.println("Better luck next time");
	 		System.out.println("You have reached " + 10 + " guesses");
	 	}	
	 	
	 in.close();
	}
}
