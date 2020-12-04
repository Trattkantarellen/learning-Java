package 1dv506_lab2;

import java.util.Scanner;

public class RaknaSiffror {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int zero = 0;
		int odd = 0;
		int even = 0;
		 System.out.print("integer: ");
	       int value = in.nextInt();
	  
		while (value > 0){
			if (value % 10==0){
		       zero++;
		    }
		   
			else if (value % 2==0){
		       even++;
		    }
		    
			else if (value % 2 == 1){ 
		       odd++;
		    }

		    value = value / 10; //tar bort sista siffran
		} 
		
		System.out.println("zero: " + zero);
		System.out.println("even: " + even);
		System.out.println("odd: " + odd);
		in.close();
	}	
}
