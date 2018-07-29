import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/*Fields
		 *	•	A List of Card
		 *Methods
		 *	•	Shuffle (should randomize the order of the cards)
		 *	•	Draw (should remove the top card from the list of cards and return it)
		 *	•	In the constructor, when a new Deck is instantiated, it should have the standard 52 cards in a Deck.
		 */

public class Deck {

	int[] deck = new int[52];
	String[] name = {"Spades","Hearts", "Diamonds", "Clubs"};
	String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	      
	     @Override 
	     public String toString() {
	     return ("value" + value + " of " + "name" + name);

	     }
	private List<Card> cards;
	private Object[] card;
	public Deck() {
		cards = new ArrayList<Card>();
		for (int i = 0; i <4; i++) {
			for (int j = 2; j < 15; j++) {
				cards.add(new Card(j, createCard(i,j)));
			
		}	

	public void Shuffle(){
	     Random rand = new Random();
	     for(int i = 0 ; i < 20 ; i ++){
	         int firstCard = rand.nextInt(52);
	         int secondCard = rand.nextInt(52);
	         Collections.swap(cards,firstCard,secondCard);      
	        }
	    }
	
	 public Card draw(Deck deck){
	       Object draw = deck.card[0];
	       add.hand(draw);
	       
	    }
	}
	