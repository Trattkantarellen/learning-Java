package 1dv506_lab3;

import java.util.Random;

public class Deck {
	// Fält:
		private Card[] cards = new Card[52];
		private int length;

		// Hjälp:
		Random help = new Random();
		
		// konstruktor
		public Deck(boolean ordered) {
			this.length = 52;
			int i = 0;
			for (Card.Suite house : Card.Suite.values()) {
				for (Card.Values value: Card.Values.values()) {
					this.cards[i++] = new Card(house, value);
				}
			}
			if (!ordered) {
				this.shuffle();
			}
		}
		
		
		public void shuffle() {
			Random random = new Random();
			int k = random.nextInt(100) +1 * random.nextInt(100) +1;
			if (this.length == 52) {
				for (int i = 0; i < k; i++) {
					this.move(this.help.nextInt(this.length), this.help.nextInt(this.length));
				}
			} else {
				System.err.print("Can only shuffle with 52 cards");
			}
		}
		public Card giveOneCard(boolean random) {
			if(this.length <= 0){
				throw new IllegalArgumentException("No more cards to give out");
			}
			int give_index = 0;
			if (random) give_index = this.help.nextInt(this.length);
			this.move(give_index, 51);
			this.length--;
			return this.cards[51];
		}
		
		
		// hjälpmetoder:
		private void move(int index_a, int index_b) {
			if ((index_a != index_b) && 
				(index_a < 52 && index_a >= 0) && 
				(index_b < 52 && index_b >= 0)) {
				Card[] cards_new = new Card[52];
				for (int i = 0; i < 52; i++) {
					if (i < index_a && i < index_b){
						cards_new[i] = this.cards[i];
					}
					if (i > index_a && i > index_b){ 
						cards_new[i] = this.cards[i];
					}
					if (i < index_a && i >= index_b){
						cards_new[i+1] = this.cards[i];
					}
					if (i > index_a && i <= index_b){
						cards_new[i-1] = this.cards[i];
					}
					if (i == index_a){
						cards_new[index_b] = this.cards[index_a];
					}
				}
				// uppdatering:
				this.cards = cards_new;
			} 
		}
		
		
		
	
		public int getCardsLeft() {
			return this.length;
		}

	}

