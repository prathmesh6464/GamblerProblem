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


		//METHOD OF WIN OR LOOSE USING RANDOM FUNCTION
		while(true)
		{
			int stake = 100;
			int totalAmountAfterMonthWon = 0;
			int totalAmountAfterMonthLost = 0;
			int day = 1;
			int dayWon = 0;
			int dayLost = 0;
			int minWonDay = 0;
			int maxWonDay = 0;
			int maxWonValue = 0;
			int minWonValue = 50;
			int sumWonLost = 0;
			int sumLost = 0;
			int minValue = 0;
			int maxValue = 0;


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
							sumWonLost += RESIGN_WON_LOST_INCREMENT;
							maxWonValue = totalAmountAfterMonthWon;
							System.out.println("sum Won  : "+sumWonLost);
							if(maxValue < sumWonLost)
							{
								maxWonDay = day;
								maxValue = sumWonLost;
								System.out.println("sum Won  : "+maxWonDay+" maximum value : "+maxValue);
							}
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
							sumWonLost -= RESIGN_WON_LOST_INCREMENT;
							minWonValue = totalAmountAfterMonthLost;
							System.out.println("sum Lost : "+sumWonLost);
							if(minValue > sumWonLost)
							{
								minWonDay = day;
								minValue=sumWonLost;
								System.out.println("sum Lost  : "+minWonDay+" minimum value : "+minValue);
							}
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
			System.out.println("Lukiest Day    : "+maxWonDay+" And Amount Won : "+maxValue);
			System.out.println("Unukiest Day   : "+minWonDay+" And Amount lost: "+minValue);


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
