
public class Card {

		/*Fields
		 *	•	Value (e.g. 2 – 10 are their respective values. Jack – Ace is 11 – 14)
		 *	•	Name (e.g. Ace of Diamonds, or Two of Hearts)
		 *Methods
		 *	•	Getters and setters for the fields
		 *	•	A method that prints out information about the card
		 */
		private int value;
		private String name;
		
		@Override
		public String toString() {
			return ("Name: + name " + "Value: + value");
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}
