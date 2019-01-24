package projects.elevens.act1;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		List<Card> cards = new ArrayList<>();

		cards.add(new Card("King", "Clubs", 12));
		cards.add(new Card("Queen", "Spades", 11));
		cards.add(new Card("4", "Diamonds", 4));
		cards.add(new Card("6", "Heart", 6));

		for(Card card : cards){
			System.out.println(" ----- New Card  -----");
			System.out.println(card);
			System.out.println(card.rank());
			System.out.println(card.rank());
			System.out.println(card.pointValue());

		}

	}
}
/*
Out:
 ----- New Card  -----
King Clubs(Point Value =  12)
King
King
12
 ----- New Card  -----
Queen Spades(Point Value =  11)
Queen
Queen
11
 ----- New Card  -----
4 Diamonds(Point Value =  4)
4
4
4
 ----- New Card  -----
6 Heart(Point Value =  6)
6
6
6
 */