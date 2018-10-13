/**
 * 
 * @author mshanker22
 *
 */
import java.util.Scanner;

public class DiceTarget 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a target value between 1 and 12: ");
		int targetval = in.nextInt();
		
		while (targetval<2 || targetval>12)
		{
			System.out.print("Invalid Entry, Please enter a target value between 1 and 12: ");
			targetval = in.nextInt();
		}

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int dice1Val= dice1.roll();
		int dice2Val= dice2.roll();
		int sum = dice1Val + dice2Val;
		
		while (sum != targetval)
		{
			dice1Val= dice1.roll();
			dice2Val= dice2.roll();
			sum = dice1Val + dice2Val;
			System.out.println("Dice1 Value = " + dice1Val + " Dice2 Value = " + dice2Val + " Sum = " +sum);
		}
		
		System.out.println("Total Rolls: " + dice1.getNumRolls());
	}

}
