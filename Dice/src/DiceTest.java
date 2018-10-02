public class DiceTest 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		System.out.println(dice1.roll());
		System.out.println(dice1.roll());
		System.out.println(dice1.roll());
		System.out.println(dice1.roll());
		System.out.println(dice1.roll());
		System.out.println(Math.random()*6+1);
		System.out.println("rolls: " + dice1.getNumRolls());
		
	}

}


