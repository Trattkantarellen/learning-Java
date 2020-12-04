package 1dv506_lab2;

import java.util.Scanner;

import java.util.ArrayList;

public class OmvandOrdning {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		int i = 0;
		ArrayList<Integer>list = new ArrayList<Integer>();
		ArrayList<Integer>reverse = new ArrayList<Integer>();
		
		while (number >= 0){
			for (i = 1; number>= 0; i++){
				System.out.print("number (quite with a negative number): " + i +": ");
				number = in.nextInt();
				list.add(number);
			}
		} 
		
		list.remove( list.size() -1); //tar bort sista talet
		for (i = list.size() -1; i >= 0; i--){
			reverse.add(list.get(i));
		}
		
		System.out.println("Positive numbers :" + list.size());
		System.out.print("reverse :" + reverse);
		in.close();
	}
}

