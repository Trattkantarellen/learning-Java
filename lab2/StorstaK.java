package 1dv506_lab2;

import java.util.Scanner;

public class StorstaK {
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("positive interger: ");
			int number = in.nextInt();
			int sum = 0;
			int i;
			
			for (i = 0; sum < number; i= i +2){
				sum = sum + i;
			}
			
			i = i - 4;
			if (0 == number){
				System.out.println("0=0" + "," + "K finns ej"  );
			}	
			
			else if (2 >= number){
				System.out.println("0<" +number + "," + "K = " + i);
			}
			
			else if (6 >= number){
				System.out.println("0+2 <" +number + "," + "K = " + i);
			}
			
			else if (12 >= number){
				System.out.println("0+2+4 <" +number + "," + "K = " + i);
			}
			
			else if (12 <= number){
				System.out.println("0+2+4+...+K <" +number + "," + "K = " + i);
			}
			
		in.close();
	}
}
				
	
