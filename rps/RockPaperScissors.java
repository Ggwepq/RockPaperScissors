package rps;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static String playerName;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
		System.out.println("Rock Paper Scissors Game\n".toUpperCase());
		System.out.println(">> Start \n>> Quit ");
		System.out.print("\n>> ");
		String menuChoice = sc.nextLine();
		
		if (menuChoice.equals("Start") || menuChoice.equals("start")) {
			System.out.print("\nEnter Player Name: ");
			playerName = sc.nextLine();
			System.out.println("Enjoy " +playerName+ "!!\n\n");
			Thread.sleep(1000);
			game();
		} else if (menuChoice.equals("Quit") || menuChoice.equals("quit")) {
			break;
		}
		}
	}
	
	public static void game() throws InterruptedException {
Scanner sc = new Scanner(System.in);
		
		// score
		int playerScore = 0, comScore = 0, gameDraw = 0;
		
		// player health
		int playerHealth = 3;
		
		System.out.println(">>// Rock, Paper, Scissors. First to 10.\\<<\n");
		
		while (true) {
		
		// computer move
		String[] moveList = {"rock", "paper", "scissors"};
		String comChoice = moveList[new Random().nextInt(moveList.length)];
		
		// player move
		String playerChoice;
		
		// game stats
		System.out.println("\t    >>> Stats <<<");
		System.out.println("{ Life: " + playerHealth + " || " + playerName + ": " + playerScore + " || Computer: " + comScore + " || Draw: " + gameDraw + "}\n");
		
		while(true) {
			System.out.println("Choose your move ( rock || paper || scissors ): ");
			System.out.print(">> ");
			playerChoice = sc.nextLine();
			if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors") || playerChoice.equals("Rock") || playerChoice.equals("Paper") || playerChoice.equals("Scissors")) {
				break;
				}
			System.out.println("\n" + playerChoice + " is not a real move :( ...\n");
		}
		
		Thread.sleep(1000);
		// display both choices
		System.out.println("\nPlayer: " + playerChoice);
		System.out.println("Computer: " + comChoice);
		
		
		// Scoring mechanics
		if (playerChoice.equals(comChoice)) {
			Thread.sleep(500);
			System.out.println(">>Draw!!<<");
			gameDraw++;
		} 
		
			else if (playerChoice.equals("rock")) {
				if (comChoice.equals("scissors")) {
					Thread.sleep(1000);
					System.out.println("WIN :) ");
					playerScore++;
					playerHealth++;
				} else if (comChoice.equals("paper")) {
					Thread.sleep(1000);
					System.out.println("LOSE :( ");
					comScore++;
					playerHealth--;
				}
			}
		
			else if (playerChoice.equals("paper")) {
				if (comChoice.equals("rock")) {
					Thread.sleep(1000);
					System.out.println("WIN :) ");
					playerScore++;
					playerHealth++;
				} else if (comChoice.equals("scissors")) {
					Thread.sleep(1000);
					System.out.println("LOSE :( ");
					comScore++;
					playerHealth--;
				}
			}
		
			else if(playerChoice.equals("scissors")) {
				if (comChoice.equals("paper")) {
					Thread.sleep(1000);
					System.out.println("WIN :) ");
					playerScore++;
					playerHealth++;
				} else if (comChoice.equals("rock")) {
					Thread.sleep(1000);
					System.out.println("LOSE :( ");
					comScore++;
					playerHealth--;
				}
			}
			Thread.sleep(1500);
		
		
			// WIN & LOSE MECHANICS
			if(playerScore == 10) {
				System.out.println("\nYou Win the Game. Here's a :) !");
				Thread.sleep(500);
				System.out.println("\nPlay again? (y/n)");
				System.out.print(">> ");
				String playAgain = sc.nextLine();
				
					if (!playAgain.equals("y")) {
						break;
					} else {
						playerHealth = 3;
						playerScore = 0;
						comScore = 0;
					}
			} else if (comScore == 10) {
				System.out.println("\nYou Lose the Game :( ...");
				Thread.sleep(500);
				System.out.println("\nPlay again? (y/n)");
				System.out.print(">> ");
				String playAgain = sc.nextLine();
				
					if (!playAgain.equals("y")) {
						break;
					} else {
						playerHealth = 3;
						playerScore = 0;
						comScore = 0;
					}
			}
			
			if (playerHealth == 0) {
				System.out.println("\nYou are out of Lives :< ...");
				Thread.sleep(500);
				System.out.println("\nPlay again? (y/n)");
				System.out.print(">> ");
				String playAgain = sc.nextLine();
				
					if (!playAgain.equals("y")) {
						break;
					} else {
						playerHealth = 3;;
						playerScore = 0;
						comScore = 0;
					}
			}
			
			
			System.out.println("\n");
	}

}
}
