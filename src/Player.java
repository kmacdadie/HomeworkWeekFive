import java.util.List;

/*Fields
		 *	•	Hand (List of Card)
		 *	•	Score
		 *	•	Name
		 *Methods
		 *	•	Describe (should print out info about the Player)
		 *	•	Discard (should remove a specific card from the Hand field)
		 *	•	Draw (should take a Deck as an argument and call the draw() method on the Deck an add the returned Card to the hand field)
		 */
public class Player {

	private String name;
	private int score;
	private List<Card> hand;
	
	public boolean discard(Card card) {
		return hand.remove(card);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	
	public void describe() {
		System.out.println("Player: " + name + "\tScore: " + score + "\tHand: " + hand);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

}
