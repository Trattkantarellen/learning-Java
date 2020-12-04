package 1dv506_lab2;

import java.util.Random;

import java.util.ArrayList;

public class Frekvenstabell {

public static void main(String[] args) {
	Random rand = new Random();
	int i;
	int random = 0;
	ArrayList[] dice={
	new ArrayList<Integer>(),
	new ArrayList<Integer>(),
	new ArrayList<Integer>(),
	new ArrayList<Integer>(),
	new ArrayList<Integer>(),
	new ArrayList<Integer>()};
	
	
	
	for (i = 0; i <= 5999; i++){
		random  = rand.nextInt(6) +1;
		if (random == 1){
		dice[0].add((int)random);
	}	
		else if	(random == 2){
			dice[1].add((int)random);
		}	
		
		else if	(random == 3){
			dice[2].add((int)random);
		}	
		
		else if	(random == 4){
			dice[3].add((int)random);
		}	
		
		else if	(random == 5){
			dice[4].add((int)random);
		}	
		
		else if	(random == 6){
			dice[5].add((int)random);
		}	
		
	}
	System.out.println("ones: " + dice[0].size());
	System.out.println("twos: " + dice[1].size());
	System.out.println("threes: " + dice[2].size());
	System.out.println("fours: " + dice[3].size());
	System.out.println("fives: " + dice[4].size());
	System.out.println("sixes: " + dice[5].size());
	}
	
}


