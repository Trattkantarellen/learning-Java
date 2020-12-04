package 1dv506_lab2;

import java.text.DecimalFormat;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class Lonerevision {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		double totalwages = 0;
		double sumwages = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(); // För jämt antal löner median
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(); // För jämt antal löner median
		
		System.out.print("Provide  any number of  integers  and stop  with  an X:  " );
		while(in.hasNextInt()){
			numbers.add(in.nextInt());
			}	
		
		numbers1.addAll(numbers);
		numbers2.addAll(numbers);
		Collections.sort(numbers);
		Collections.sort(numbers1);
		Collections.sort(numbers2);
		
		
		for(int i = 0; i <numbers.size(); i++){
			sumwages = sumwages + numbers.get(i);
			totalwages++;
		}
		
		double average = sumwages / totalwages;
		DecimalFormat averageFormat = new DecimalFormat("0.##");
		String averageDecimal = averageFormat.format(average);
		System.out.println("Average wage: " + averageDecimal); 
		
		if(numbers.size() % 2 == 1){  //För udda antal löner
			double value = numbers.get((numbers.size()/2) );
			DecimalFormat valueFormat = new DecimalFormat("0.##");
			String valueDecimal = valueFormat.format(value);
			System.out.println("Median wage: " + valueDecimal);
		}
		
		else if(numbers.size() % 2 == 0){ //för jämna antal löner
			numbers1.add(0, 0);
			numbers2.remove(0);
			double value1 = numbers1.get((numbers1.size()/2) );
			double value2 = numbers2.get((numbers2.size()/2) );
			double value3 = ((value1 + value2) / 2);
			DecimalFormat value3Format = new DecimalFormat("0.##");
			String value3Decimal = value3Format.format(value3);
			System.out.println("Median wage: " + value3Decimal);
		}
		
		double lastNumber = numbers.get(numbers.size() - 1); //löneskillnaden
		double firstNumber = numbers.get(0);
		double finaleGap = lastNumber - firstNumber;
		DecimalFormat finalFormat = new DecimalFormat("0.##");
		String GapDecimal = finalFormat.format(finaleGap);
		System.out.println("Gap: " + GapDecimal);
		in.close();
		}
}	
		

