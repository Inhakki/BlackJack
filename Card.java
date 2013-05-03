
public class Card {
  //1 for hearts, 2 for diamonds, 3 for spades, 4 for clubs
	private int type;
	private String value;
	
	public Card (int type, String value)
	{
		this.type = type;
		this.value = value;
	}
	
	public int getType ()
	{
		return type;
	}
	
	public String getValue ()
	{
		return value;
	}
}
