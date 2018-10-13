/**
 * 
 * @author mshanker22
 *
 */
public class DiceWhile 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		while (dice1.roll() != dice2.roll())
		{
			int dice1Val= dice1.getRollValue();
			int dice2Val= dice2.getRollValue();
			int sum = dice1Val + dice2Val;
			System.out.println("Dice1 Value = " + dice1Val + " Dice2 Value = " + dice2Val + " Sum = " +sum);
		}
		System.out.println("Total Rolls: " + dice1.getNumRolls());
	}

}
