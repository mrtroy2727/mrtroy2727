package first_prog;
import java.util.Random;

public class DeckOfCards {
	private Card[] deck; // array of Card objects
	private int currentCard; // index of next Card to be dealt(0-51)
	private static final int NUMBER_OF_CARDS = 52; // Constant number of Cards
	//random number generator.
	private static final Random randomNumbers = new Random();
	//constructor fills deck of Cards
	public DeckOfCards()
	{
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS]; //Create array of Card objects
		currentCard = 0; // set currentCard so first Card dealt is deck [0]
		
		// populate deck with Card objects
		for(int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13 ], suits[ count / 13]);
	} // end Constructor DeckOfCards
	
	// shuffle deck of Cards with one-pass algorithm
	public void shuffle()
	{
		// after shuffling, dealing should start at deck[0] again
		currentCard = 0; // re-initiliaze currentCard
		// for each Card, Pick another random Card(0-51) and swap them
		for(int first = 0;first < deck.length; first++) {
			//select a random number between 0 and 51
			int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
			
			// swap current Card with randomly selected Card
			Card temp = deck[ first ];
			deck[first] = deck[second];
			deck[second] = temp;
			
		}// end for
		
	}//end shuffle
	
	public Card dealCard()
	{
		//determine whether Cards remain to be dealt
		if(currentCard < deck.length)
			return deck[ currentCard++];
		else
			return null;
	}//end method dealCard
}// end of DeckOfCards Class
