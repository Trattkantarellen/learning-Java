package 1dv506_lab3;

public class Card {
	//enum för korten:
	public enum Suite {
		SPADES, HEARTS, CLUBS, DIAMONDS
	}
	public enum Values {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
		}
	//Fält:
	Suite suite;
	Values value;

	//Konstruktor:
	public Card() {
		this.setsuite(Suite.HEARTS);
		this.setValue(Values.ACE);
	}
	
	public Card(Suite suite_in, Values value_in) {
		this.setsuite(suite_in);
		this.setValue(value_in);
	}
	
	// set:
	public void setsuite(Suite suite_in) {
		this.suite = suite_in;
	}
	public void setValue(Values value_in) {
		this.value = value_in;
	}
	// get:
		public Suite getsuite() {
			return this.suite;
		}
		public Values getValue() {
			return this.value;
		}
		public String getString() {
			return value.toString() + " of " + suite.toString();
		}
}

