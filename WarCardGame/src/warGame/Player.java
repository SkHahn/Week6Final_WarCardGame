package warGame;
import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	//prints out player information and calls the describe() method for cards in the hand list
	public void describe() {
		System.out.println("Player One: " + name);
		for (int i = 0; i < hand.size(); i++)
			hand.get(i).describe();
	}
	//removes and returns the top card of the hand
	public Card flip() {
		Card flipped = hand.get(0);
		hand.remove(0);
		return flipped;
	}
	//takes a deck as an argument and calls the draw method on the deck,
	//adding the returned Card to the hand field
	public void draw(Deck deck) {
		Card drawn = deck.draw();
		hand.add(drawn);
	}
	//adds 1 to the player's score
	public void incrementScore() {
		score += 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}
