
/**
 * 
 * @author mshanker22
 *
 */
public class Dice 
	{
	private int numRolls;
	private int rollValue;

	public Dice()
	{
		numRolls=0;
	}
	
	public int roll()
	{
		numRolls++;
		rollValue = (int)(Math.random()*6+1);
		return rollValue;

	}
	
	public void reset()
	{
		numRolls = 0;
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
	public int getRollValue()
	{
		return rollValue;
	}
}




