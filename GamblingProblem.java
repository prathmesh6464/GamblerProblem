import java.util.Random;
import java.util.Scanner;
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
		int day = 1;
		int dayWon = 0;
		int dayLost = 0;
		int minDay=0;
		int maxDay=0;
		int maxValue=0;
		int minValue=50;


		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		while(true)
		{
			for(int iter=0; iter<MONTH; iter++)
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
							maxValue = totalAmountAfterMonthWon;
							maxDay = day;
							break;						
						}					
					}
					else
					{
						stake--;
						if(RESING_LOST == stake) 
						{
							dayLost++;
							totalAmountAfterMonthLost += RESIGN_WON_LOST_INCREMENT;
							minValue = totalAmountAfterMonthLost;
							minDay = day;
							break;
						}					
					}				
				}
				stake = 100;
				day += 1;
			}
			
			
			//DISPLAYING TOTAL WON,LOST,LUKIEST AND UNLUKIEST DAY
			System.out.println("Total Day Won  : "+dayWon+" And Won Money  : "+totalAmountAfterMonthWon);
			System.out.println("Total Day Lost : "+dayLost+" And Lost Money : "+totalAmountAfterMonthLost+"\n");
			System.out.println("Lukiest Day    : "+maxDay+" And Amount Won : "+maxValue);
			System.out.println("Unukiest Day   : "+minDay+" And Amount lost: "+minValue);
			
			
			//ASKING PERMISION TO USER THAT USER WANT TO PLAY OR NOT 
			System.out.println("You Want To Play Again For Next Month Yes Or No : ");
			Scanner sc = new Scanner(System.in);
			String decision = sc.nextLine();
			boolean result = decision.equals("Yes");
			boolean result2 = decision.equals("yes");
			
			
			//CHEKING USER DECISION
			if(result || result2)
			{
				System.out.println("Started Again");
			}
			else
			{
				System.out.println("Thank You");
				break;
			}
			
		}
	}
}
