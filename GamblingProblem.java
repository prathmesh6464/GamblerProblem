import java.util.Random;
public class GamblingProblem 
{
	public static void main(String[] args)
	{
		//CONSTANT VARIABLE
		int RESIGN_WON = 150;
		int RESING_LOST = 50; 
		int RESIGN_WON_LOST_INCREMENT = 50;
		int MONTH = 30;

		
		//VARIABLES
		int stake = 100;
		int totalAmountAfterMonthWon = 0;
		int totalAmountAfterMonthLost = 0;
		int day=1;
		int dayWon = 0;
		int dayLost = 0;

		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		for(int iter=0;iter<MONTH;iter++)
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
						dayWon++;
						totalAmountAfterMonthWon += RESIGN_WON_LOST_INCREMENT;
						break;						
					}					
				}
				else
				{
					stake--;
					if(RESING_LOST == stake) 
					{
						dayLost++;	
						totalAmountAfterMonthLost += RESIGN_WON_LOST_INCREMENT ;
						break;
					}					
				}				
			}
			stake = 100;
			day += 1;
		}
		System.out.println("Total Day Won  : "+dayWon+" And Won Money After Won  : "+totalAmountAfterMonthWon);
		System.out.println("Total Day Lost : "+dayLost+" And Lost Money After Lost  : "+totalAmountAfterMonthLost);
	}
}
