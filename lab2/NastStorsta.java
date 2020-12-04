package 1dv506_lab2;

import java.util.Scanner;

public class NastStorsta {
	public static void main(String[] args){
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE; //min värde av de två högsta
		Scanner in = new Scanner(System.in);
		
		System.out.print("ten Intergers separated with spaces: ");
		
		for(int i = 0; i<=9; i++){
			int numbers = in.nextInt();
				if (numbers >= max ){
					min = max;
					max = numbers;
					
				}
				
				else if (max > numbers && numbers >= min ){
					min = numbers;
				}
				
			
		}

		System.out.println("second largest interger: " + min);
		in.close();
	}
}	
