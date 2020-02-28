import java.util.*;
public class GamblingProblem 
{
	public static void main(String[] args)
	{
		//CONSTANT VARIABLE
		int BET = 1;
		int RESIGN_WON = 150;
		int RESIGN_LOST = 50;

		//VARIABLES
		int stake = 100;
		int winCount = 0;
		int looseCount = 0;

		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		while(true)
		{
			Random randomValue = new Random();
			int turnResult = randomValue.nextInt(2);
			if(turnResult == 1) 
			{
				System.out.println("Head");
				winCount++;
				stake++;
				System.out.println("Stake : "+stake);
				if(RESIGN_WON == stake) 
				{
					System.out.println("Resign And Current Balance is : "+stake);	
					break;
				}
			}
			else
			{
				System.out.println("Tail");
				looseCount++;
				stake--;
				System.out.println("Stake : "+stake);
				if(RESIGN_LOST == stake) 
				{
					System.out.println("Resign And Current Balance is : "+stake);
					break;
				}
			}
			System.out.println("Win Count   : "+winCount);
			System.out.println("Loose Count : "+looseCount);
		}
	}
}
