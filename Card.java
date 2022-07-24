package first_prog;


public class Card
{
	private String face; // face of card ("Ace", "Deuce", ...)
	private String suit; // suit of card ("Hearts", "Diamonds", ...)
	// two- argument constructor intializes card's face and suit
	public Card(String cardFace, String cardSuit)
	{
		face = cardFace; // initialize face of card
		suit = cardSuit; // initialize suit of card
	} // end two-argument Card Constructor
	
	// Return String representation of Card
	public String toString()
	{
		return face + " of " + suit;
	} // end method toString
	
	} // end class Card