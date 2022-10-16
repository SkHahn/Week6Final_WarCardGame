package warGame;
public class App {

	public static void main(String[] args) {
		
		Deck gameDeck = new Deck();
		Player playerOne = new Player("Rick");
		Player playerTwo = new Player("Morty");		
		System.out.println(playerOne.getName() + " and " + playerTwo.getName() + " are going to player the card game War.");
		
		gameDeck.shuffle();
		System.out.println("The deck has been shuffled");
		System.out.println("SHOW ME WHAT YOU GOT\n");
		
		//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 1) {
				playerOne.draw(gameDeck);
			}
			else if (i % 2 == 0) {
				playerTwo.draw(gameDeck);
			}
		}	
		//26 iterations for each player (26 Rounds of play for the game)
		for (int i = 0; i < 26; i++) {
			Card player1Card = playerOne.flip();
			Card player2Card = playerTwo.flip();
			
			System.out.println(playerOne.getName() + " flips over the " + player1Card.getName());
			System.out.println(playerTwo.getName() + " flips over the " + player2Card.getName());
		
		//scoring each round of play using the incrementScore method
			if (player1Card.getValue() > player2Card.getValue()) {
			System.out.println(playerOne.getName() + " has won this round. They get a point!\n");
			playerOne.incrementScore();
			}
			else if (player2Card.getValue() > player1Card.getValue()) {
			System.out.println(playerTwo.getName() + " has won this round. They get a point!\n");
			playerTwo.incrementScore();
			}
			else {
			System.out.println("This round is a draw! No point for either player.\n");
			}	
		}
	
		
	//getting the final score	
	int playerOneScore = playerOne.getScore();
	int playerTwoScore = playerTwo.getScore();
	
	//Printing the final score of each player and the winner of the game.
	System.out.println("The game has ended! Show me what you got! \nThe results are:");
	System.out.println(playerOne.getName() + ": " + playerOneScore);
	System.out.println(playerTwo.getName() + ": " + playerTwoScore);
	
	if (playerOneScore > playerTwoScore) {
		System.out.println(playerOne.getName() + " has won the game!");
		}
	else if	(playerTwoScore > playerOneScore) {
		System.out.println(playerTwo.getName() + " has won the game!");
		}
	else {	
		System.out.println("Scores are tied! The game ends in a Draw!");
		}		
	}
	}
	

