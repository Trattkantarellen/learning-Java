package 1DV506_lab1;

import java.lang.Math;

import java.util.Scanner;

public class Avstand {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

    System.out.print("Ange f�rsta koordinater(x,y): ");
    String koordinater = in.nextLine();
    String[] delar = koordinater.split(","); 
    String x = delar[0].trim().substring(1); //tar bort ( och eventuella mellanslag 
    String y = delar[1].trim().substring(0, delar[1].trim().length() - 1);
    int x1 = Integer.valueOf(x);
    int y1 = Integer.valueOf(y);
    
    System.out.print("Ange andra koordinater(x,y): ");
    String kordinatera = in.nextLine();
    String[] delara = kordinatera.split(","); // skiljer x fr�n y; G�r att det m�ste vara heltal
    String xa = delara[0].trim().substring(1);
    String ya = delara[1].trim().substring(0, delara[1].trim().length() -1);
    int x2 = Integer.valueOf(xa);
    int y2 = Integer.valueOf(ya);
    
    double avstand = Math.sqrt(Math.pow((x2 -x1),2) + (Math.pow((y2 -y1),2))); // Formeln f�r vindavkylning
    double avstand1 = avstand * 1000;
    double avstand2 = avstand1 + 0.5; // 0m talet �r st�rre �n x.5 s� att avrundningen blir r�tt
    int avstand3 = (int) avstand2;
    double avstand4 = avstand3;
    double avstand5 = avstand4 / 1000;
	System.out.println("Avst�ndet �r: " + avstand5);
	
	in.close();
	}
}
