import java.util.*;
public class GamblingProblem 
{
	public static void main(String[] args)
	{
		//CONSTANT VARIABLE
		int BET = 1;
		
		
		//VARIABLES
		int stake = 100;
		int winCount = 0;
		int looseCount = 0;
		
		
		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		Random randomValue = new Random();
		int turnResult = randomValue.nextInt(2);
		if(turnResult == 1) 
		{
		    	System.out.println("Head");
		    	winCount++;
		    	stake++;
		    	System.out.println("Stake : "+stake);
		}
		else
		{
				System.out.println("Tail");
		  		looseCount++;
				stake--;
				System.out.println("Stake : "+stake);
		}
		System.out.println("Win Count : "+winCount);
		System.out.println("Loose Count : "+looseCount);
	}
}
