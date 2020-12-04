package 1dv506_lab3;

public class Deckmain {

	public static void main(String[] args) {
	Deck Obergsspelkort = new Deck(false);
	System.out.println("Check how many cards the deck has to start with: " + Obergsspelkort.getCardsLeft());
		System.out.println("Drawing 10 random cards:");
		for (int i = 0; i < 10; i++) {
			Card draw = Obergsspelkort.giveOneCard(false);
			System.out.println(i + 1 +": " + draw.getString());
		}
		System.out.println("Cards left: " + Obergsspelkort.getCardsLeft());
		
	/* Testar att blanda en inte komplett kortlek:
		  System.out.println("Shuffle first, draw second, third try to shuffle again: ");
		Deck julmust = new Deck(false);
		julmust.shuffle(); //innan dragning
		Card draw1 = julmust.giveOneCard(false); 
		  System.out.println(1 +": " + draw1.getString());
		  julmust.shuffle(); //efter dragning kommer ge felmeddelande */
	
	//	Kommer kasta Exception när kort nummer 53 kommer att dras:
	System.out.println("Cannot draw more cards than 52:");
	  Deck paskmust = new Deck(false);
	  for (int i = 0; i < 53; i++){
	  Card draw = paskmust.giveOneCard(false);
	  System.out.println(i + 1 +": " + draw.getString());
	  } 
	 }
}

