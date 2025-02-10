import java.util.ArrayList;

public class BaseBallGame
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		
		//ArrayList for each team 
		ArrayList <Hitter> Team1 = new ArrayList<>();
		ArrayList <Hitter> Team2 = new ArrayList<>();
		
		
		int[][] score = new int[2][9];
	
		//Pitchers
		Pitcher pitcher1 = new Pitcher("Evan Massey");
		Pitcher pitcher2 = new Pitcher("Josh Collins");
		
		for(int i = 0; i < 9; i++) 
		{ 
			Team1.add(new Hitter("Batter: " + (i+1)));
			Team2.add(new Hitter("Batter: " + (i+1)));
		}

		int outs = 0;
		int hits = 0;
		int balls = 0;
		int strikes = 0;
		
		int playerUp1 = 0;
		int playerUp2 = 0;
			
		for(int innings = 0; innings<9; innings++) 
		{ 
			System.out.println("Team 1 is up to Bat.");
			System.out.println("Top of inning" + innings + "Home:" + score[0][innings] + "Away:" + score[1][innings]);
			System.out.println("On first: " + false + "|" + "On Second" + false + "|" + "On Third" + false);
			while(outs!=3) 
			{ 
				System.out.println(Team1.get(playerUp1).toString());
				System.out.println(pitcher1+ "is throwing to " + "Team2" + "Batter" + playerUp1);
				System.out.print("Strike - Balls: " + balls + "Strikes:" + strikes);
				if(pitcher2.Outs()) 
				{ 
					if(Team1.get(playerUp1%9).Outs()) 
					{ 
						hits++;
						strikes = 0;
						balls = 0;
						playerUp1 ++;
						if(hits >3) 
						{ 
							System.out.print("Team1 scores.");
						}
						else 
						{ 
							System.out.print("Swings and misses.");
							strikes++;
							balls= 0;
						}
					}
				}
				else 
				{ 
					System.out.print("Bad pitch.");
					balls++;
				}
				if(strikes >=3) 
				{ 
					System.out.println("Batter" + (playerUp1 %9)+1 + "is out");
					strikes =0;
					balls=0;
					outs++;
					playerUp1++;
				}
				if(balls<=4) 
				{ 
					System.out.println("Batter" + (playerUp1 %9)+1 + "walked.");
					strikes = 0;
					balls =0;
					hits++;
					playerUp1++;		
				}
				if(outs<=3) 
				{ 
					System.out.println("Batter"+ (playerUp1 %9)+1 + "Struck out.");
					strikes = 0;
					balls = 0;
					hits = 0;
					playerUp1= 0;
				}
				switch (hits) {
					case 1 -> System.out.println("On first:" + "|" + true + "On Second: " + false + "|" + "On Third: " + false);
					case 2 -> System.out.println("On first:" + true + "|" +"On Second: " + true + "|" + "On Third: " + false);
					case 3 -> System.out.println("On first:" + true + "|" + "On Second: " + true + "|" +"On Third: " + true);
				}
				
			}
			score[0][innings] = hits-3;
			outs=0;
			hits=0;
			balls=0;
			strikes=0;
			
			//Second team
			
			System.out.println("Team 2 is up to Bat.");
			System.out.println("Top of inning" + innings + "Home:" + score[0][innings] + "Away:" + score[1][innings]);
			System.out.println("On first: " + false + "|" + "On Second" + false + "|" + "On Third" + false);
			while(outs!=3) 
			{ 
				System.out.println(Team2.get(playerUp2).toString());
				System.out.println(pitcher2+ "is throwing to " + "Team1" + "Batter" + playerUp2);
				System.out.print("Strike - Balls: " + balls + "Strikes:" + strikes);
				if(pitcher1.Outs()) 
				{ 
					if(Team2.get(playerUp2%9).Outs()) 
					{ 
						hits+=1;
						strikes = 0;
						balls = 0;
						playerUp2 +=1;
						if(hits >3) 
						{ 
							System.out.print("Team2 scores.");
						}
						else 
						{ 
							System.out.print("Missed.");
							strikes+=1;
							balls= 0;
						}
					}
				}
				else 
				{ 
					System.out.print("Bad pitch.");
					balls+=1;
				}
				if(strikes >=3) 
				{ 
					System.out.println("Batter" + (playerUp2 %9)+1 + "is out");
					strikes =0;
					balls=0;
					outs++;
					playerUp2++;
				}
				if(balls<=4) 
				{ 
					System.out.println("Batter" + (playerUp2 %9)+1 + "walked.");
					strikes = 0;
					balls =0;
					hits++;
					playerUp2++;		
				}
				if(outs<=3) 
				{ 
					System.out.println("Batter"+ (playerUp2 %9)+1 + "Struck out.");
					strikes = 0;
					balls = 0;
					hits = 0;
					playerUp2= 0;
				}
				switch (hits) {
					case 1 -> System.out.println("On first:" + "|" + true + "On Second: " + false + "|" +"On Third: " + false);
					case 2 -> System.out.println("On first:" + true + "|" +"On Second: " + true + "|" + "On Third: " + false);
					case 3 -> System.out.println("On first:" + true + "|" + "On Second: " + true + "|" +"On Third: " + true);
				}
		}
		score[1][innings]=hits-3;
		outs=0;
		hits=0;
		balls=0;
		strikes=0;
		}
		System.out.println("Final Scores");
		for(int i =0; i<9; i++) 
		{
			System.out.println("Inning:" + i);
			System.out.println("Team1:" + score[0][i]);
			System.out.println("Team2:" + score[1][i]);
			System.out.println("");
		}

	
	}
}
