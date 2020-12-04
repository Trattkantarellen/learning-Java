package 1dv506_lab2;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		System.out.print("Odd positive number: ");
		int s = in.nextInt();
		double t = (s/2.0) + 0.5;
	
		System.out.println("Right-Angled Triangle:");
		if (s % 2 == 0){
			System.out.print("Not a odd number");
		}	
		else if (s % 2 == 1){
			for(int i=0; i< s ;i++) {
				for(int j= s -1; j>=i ; j--){ // För den osynliga trianglen
					System.out.print(" ");
		    }
			
				for(int k=0; k<=i; k++){
					System.out.print("*");
		    }
		   
				System.out.println();
		   }
		}
		
			System.out.println();
			System.out.println("Isosceles Triangle:");
			if (s % 2 == 0){
				System.out.print("Not a odd number");
			}
			
			else if(s % 2 == 1){
			for(int i = 1; i <=  t; i++){
				for(int j= s-1; j >= i ;j--){
				System.out.print(" ");
					
				}
					for(int k=1;k<=i;k++){
					System.out.print("*"); //första delen av raden
				}
					for(int l= i - 1; l>=1; l--)
				{
				System.out.print("*"); //andra delen av raden
				}
				System.out.println();
				}
				}
			in.close();
		}
		
		
}

