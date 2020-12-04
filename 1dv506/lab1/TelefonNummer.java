package 1DV506_lab1;

import java.util.Random;

public class TelefonNummer {
	public static void main(String[] args) {
	Random rand = new Random();
	
	int riktStart = 0;
	
	int riktTva = rand.nextInt(10);
	int riktTre = rand.nextInt(10);
	int riktFyra = rand.nextInt(10);
	
	int lokEtt = rand.nextInt(9) +1; // Undviker att det blir 0 med +1
	int lokTva = rand.nextInt(10);
	int lokTre = rand.nextInt(10);
	int lokFyra = rand.nextInt(10);
	int lokFem = rand.nextInt(10);
	int lokSex = rand.nextInt(10);
	
	
	System.out.print(riktStart);
	System.out.print(riktTva);
	System.out.print(riktTre);
	System.out.print(riktFyra);
	System.out.print("-");
	System.out.print(lokEtt);
	System.out.print(lokTva);
	System.out.print(lokTre);
	System.out.print(lokFyra);
	System.out.print(lokFem);
	System.out.print(lokSex);
	}
}
	
