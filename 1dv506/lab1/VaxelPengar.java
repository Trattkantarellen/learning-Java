package 1DV506_lab1;

import java.util.Scanner;

public class VaxelPengar {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Kostnad: ");
	int kostnad = in.nextInt();
	
	System.out.print("Erhållet Belopp: ");
	int belopp = in.nextInt();
	
	int vaxel = belopp - kostnad;
	
	int vaxel1000 = vaxel / 1000;
	
	
	int summavaxel1000 = vaxel1000 * 1000;
	int vaxel500 = (vaxel - summavaxel1000) / 500;
	
	int summavaxel500 = vaxel500 * 500;
	int totalvaxel1 = summavaxel1000 + summavaxel500;
	int vaxel100 = (vaxel - totalvaxel1) / 100;
	
	int summavaxel100 = vaxel100 * 100;
	int totalvaxel2 = totalvaxel1 + summavaxel100;
	int vaxel50 = (vaxel - totalvaxel2) / 50;
	
	int summavaxel50 = vaxel50 * 50;
	int totalvaxel3 = totalvaxel2 + summavaxel50;
	int vaxel20 = (vaxel - totalvaxel3) / 20;
	
	int summavaxel20 = vaxel20 * 20;
	int totalvaxel4 = totalvaxel3 + summavaxel20;
	int vaxel10 = (vaxel - totalvaxel4) / 10;
	
	int summavaxel10 = vaxel10 * 10;
	int totalvaxel5 = totalvaxel4 + summavaxel10;
	int vaxel5 = (vaxel - totalvaxel5) / 5;
	
	int summavaxel5 = vaxel5 * 5;
	int totalvaxel6 = totalvaxel5 + summavaxel5;
	int vaxel1 = (vaxel - totalvaxel6) / 1;
	
	
	
	System.out.println("1000-lappar: " + vaxel1000);
	System.out.println("500-lappar: " + vaxel500);
	System.out.println("100-lappar: " + vaxel100);
	System.out.println("50-lappar: " + vaxel50);
	System.out.println("20-lappar: " + vaxel20);
	System.out.println("10-kronor: " + vaxel10);
	System.out.println("5-kronor: " + vaxel5);
	System.out.println("1-kronor: " +vaxel1);
	
	in.close();
}
}
