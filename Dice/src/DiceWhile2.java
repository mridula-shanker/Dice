/**
 * 
 * @author mshanker22
 *
 */
public class DiceWhile2 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int dice1Val= dice1.roll();
		int dice2Val= dice2.roll();
		int sum = dice1Val + dice2Val;
		System.out.println("Dice1 Value = " + dice1Val + " Dice2 Value = " + dice2Val + " Sum = " +sum);

		while (dice1Val != dice2Val)
		{
			dice1Val= dice1.roll();
			dice2Val= dice2.roll();
			sum = dice1Val + dice2Val;
			System.out.println("Dice1 Value = " + dice1Val + " Dice2 Value = " + dice2Val + " Sum = " +sum);
		}
		System.out.println("Total Rolls: " + dice1.getNumRolls());
	}

}
