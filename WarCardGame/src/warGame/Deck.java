package warGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//creating the deck of cards as private so the values can't be fucked with
	private List<Card> deckOfCards = new ArrayList<Card>();
	
	public Deck() {
		//Hearts
		deckOfCards.add(new Card(2, "Two of Hearts"));
		deckOfCards.add(new Card(3, "Three of Hearts"));
		deckOfCards.add(new Card(4, "Four of Hearts"));
		deckOfCards.add(new Card(5, "Five of Hearts"));
		deckOfCards.add(new Card(6, "Six of Hearts"));
		deckOfCards.add(new Card(7, "Seven of Hearts"));
		deckOfCards.add(new Card(8, "Eight of Hearts"));
		deckOfCards.add(new Card(9, "Nine of Hearts"));
		deckOfCards.add(new Card(10, "Ten of Hearts"));
		deckOfCards.add(new Card(11, "Jack of Hearts"));
		deckOfCards.add(new Card(12, "Queen of Hearts"));
		deckOfCards.add(new Card(13, "King of Hearts"));
		deckOfCards.add(new Card(14, "Ace of Hearts"));

		//Diamonds
		deckOfCards.add(new Card(2, "Two of Diamonds"));
		deckOfCards.add(new Card(3, "Three of Diamonds"));
		deckOfCards.add(new Card(4, "Four of Diamonds"));
		deckOfCards.add(new Card(5, "Five of Diamonds"));
		deckOfCards.add(new Card(6, "Six of Diamonds"));
		deckOfCards.add(new Card(7, "Seven of Diamonds"));
		deckOfCards.add(new Card(8, "Eight of Diamonds"));
		deckOfCards.add(new Card(9, "Nine of Diamonds"));
		deckOfCards.add(new Card(10, "Ten of Diamonds"));
		deckOfCards.add(new Card(11, "Jack of Diamonds"));
		deckOfCards.add(new Card(12, "Queen of Diamonds"));
		deckOfCards.add(new Card(13, "King of Diamonds"));
		deckOfCards.add(new Card(14, "Ace of Diamonds"));

		//Clubs
		deckOfCards.add(new Card(2, "Two of Clubs"));
		deckOfCards.add(new Card(3, "Three of Clubs"));
		deckOfCards.add(new Card(4, "Four of Clubs"));
		deckOfCards.add(new Card(5, "Five of Clubs"));
		deckOfCards.add(new Card(6, "Six of Clubs"));
		deckOfCards.add(new Card(7, "Seven of Clubs"));
		deckOfCards.add(new Card(8, "Eight of Clubs"));
		deckOfCards.add(new Card(9, "Nine of Clubs"));
		deckOfCards.add(new Card(10, "Ten of Clubs"));
		deckOfCards.add(new Card(11, "Jack of Clubs"));
		deckOfCards.add(new Card(12, "Queen of Clubs"));
		deckOfCards.add(new Card(13, "King of Clubs"));
		deckOfCards.add(new Card(14, "Ace of Clubs"));

		//Spades
		deckOfCards.add(new Card(2, "Two of Spades"));
		deckOfCards.add(new Card(3, "Three of Spades"));
		deckOfCards.add(new Card(4, "Four of Spades"));
		deckOfCards.add(new Card(5, "Five of Spades"));
		deckOfCards.add(new Card(6, "Six of Spades"));
		deckOfCards.add(new Card(7, "Seven of Spades"));
		deckOfCards.add(new Card(8, "Eight of Spades"));
		deckOfCards.add(new Card(9, "Nine of Spades"));
		deckOfCards.add(new Card(10, "Ten of Spades"));
		deckOfCards.add(new Card(11, "Jack of Spades"));
		deckOfCards.add(new Card(12, "Queen of Spades"));
		deckOfCards.add(new Card(13, "King of Spades"));
		deckOfCards.add(new Card(14, "Ace of Spades"));
	}
	
	//methods
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	} //shuffles the deck using the list method .shuffle
	
	public Card draw() {
		Card drawn = deckOfCards.get(0);
		deckOfCards.remove(0);
		return drawn;
	} //takes the first card from the shuffled deck to reveal it then removes it from play (the deck)
	
}
