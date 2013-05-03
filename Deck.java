import java.util.*;
public class Deck {
  private ArrayList<Card> myDeck;
	
	public Deck ()
	{
		for(int y = 1; y<5;y++)
		{
			for(int x = 2;x<11;x++)
			{
			
				myDeck.add(new Card(y, x +""));
			}
			
			myDeck.add(new Card(y, "Jack"));
			myDeck.add(new Card(y, "Queen"));
			myDeck.add(new Card(y, "King"));
			myDeck.add(new Card(y, "Ace"));
		}
	}
	
	public Card draw ()
	{
		int rand = (int)(Math.random()*52.0);
		Card randCard = myDeck.get(rand);
		myDeck.remove(rand);
		return randCard;
	}
	
	public int size()
	{
		return myDeck.size();
	}
}
