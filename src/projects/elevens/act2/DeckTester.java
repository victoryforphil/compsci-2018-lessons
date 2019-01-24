package projects.elevens.act2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck deck = new Deck(new String[]{"Math  Teacher", "Sci Teacher", "History  Teacher"}, new String[]{"Red", "Blue"}, new int[]{4,1,41});

		System.out.println("Size: " + deck.size());
		System.out.println("Deck: " + deck);
		System.out.println("Draw: " + deck.deal());
	}
}
/*
out:
Size: 18
Deck: size = 18
Undealt cards:
History  Teacher of Blue (point value = 41), History  Teacher of Blue (point value = 1),
History  Teacher of Blue (point value = 4), History  Teacher of Red (point value = 41),
History  Teacher of Red (point value = 1), History  Teacher of Red (point value = 4),
Sci Teacher of Blue (point value = 41), Sci Teacher of Blue (point value = 1),
Sci Teacher of Blue (point value = 4), Sci Teacher of Red (point value = 41),
Sci Teacher of Red (point value = 1), Sci Teacher of Red (point value = 4),
Math  Teacher of Blue (point value = 41), Math  Teacher of Blue (point value = 1),
Math  Teacher of Blue (point value = 4), Math  Teacher of Red (point value = 41),
Math  Teacher of Red (point value = 1), Math  Teacher of Red (point value = 4)

Dealt cards:


Draw: History  Teacher of Blue (point value = 41)
 */