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
		int totalAmountAfter20DaysWon = 0;
		int totalAmountAfter20DaysLost = 0;


		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		for(int iter=0;iter<20;iter++)
		{
			while(true)
			{ 
				Random randomValue = new Random();
				int turnResult = randomValue.nextInt(2);
				if(turnResult == 1) 
				{
					stake++;
					if(RESIGN_WON == stake) 
					{
						totalAmountAfter20DaysWon += stake;
						System.out.println("Total Amount Win  : "+totalAmountAfter20DaysWon);
						break;						
					}					
				}
				else
				{
					stake--;
					if(RESIGN_LOST == stake) 
					{
						totalAmountAfter20DaysLost += stake;
						System.out.println("Total Amount Lost : "+totalAmountAfter20DaysLost);
						break;
					}					
				}				
			}
			stake = 100;
		}
		//SHOWING ACCOUNT BALANCE AFTER 20 DAYS
		System.out.println("Acount Balance After 20 Days(Won)       : "+totalAmountAfter20DaysWon);
		System.out.println("Loose Count Balance After 20 Days(Lost) : "+totalAmountAfter20DaysLost);
	}
}
