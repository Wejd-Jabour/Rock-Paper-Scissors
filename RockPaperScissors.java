import java.util.Scanner;

class RockPaperScissors
{
	static final int ROCK = 1;
	static final int PAPER = 2;
	static final int SCISSORS = 3;
	
	static int userScore = 0;
	static int compScore = 0;
	static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		
		int userChoice;
		int compChoice;
		int retry = 1;
		
		while (retry == 1)
		{
			userChoice = userChoice();
			
			compChoice = compChoice();
			
			printResults(userChoice, compChoice);
			
			System.out.println();
			
			System.out.println("CURRENT SCORE = YOU: " + userScore + " COMPUTER: " + compScore);
			
			System.out.println();
			retry = retry();
			
			System.out.println();
		}
		
		System.out.println("Thanks for playing the fianl score is, YOU: " + userScore + " COMPUTER: " + compScore);
	
			
			
	}
	public static void printResults(int p1, int p2)
	{
		if(p1 == ROCK && p2 == SCISSORS)
		{
			System.out.println("YOU WIN");
			userScore++;
		}
		else if(p1 == ROCK && p2 == PAPER)
		{
			System.out.println("YOU LOSE");
			compScore++;
		}
		else if(p1 == ROCK && p2 == ROCK)
		{
			System.out.println("IT IS A TIE");
		}
		else if(p1 == SCISSORS && p2 == SCISSORS)
		{
			System.out.println("IT IS A TIE");
		}
		else if(p1 == SCISSORS && p2 == PAPER)
		{
			System.out.println("YOU WIN");
			userScore++;
		}
		else if (p1 == SCISSORS && p2 == ROCK)
		{
			System.out.println("YOU LOSE");
			compScore++;
		}
		else if(p1 == PAPER && p2 == SCISSORS)
		{
			System.out.println("YOU LOSE");
			compScore++;
		}
		else if(p1 == PAPER && p2 == PAPER)
		{
			System.out.println("IT IS A TIE");
		}
		else if (p1 == PAPER && p2 == ROCK)
		{
			System.out.println("YOU WIN");
			userScore++;
		}
		else if (p1 == 0)
		{
			System.out.println("INVALID ENTRY");
		}
	}
	
	
	public static int userChoice()
	{

		System.out.println("TAKE YOUR CHOICE");
		System.out.println("1	ROCK");
		System.out.println("2	PAPER");
		System.out.println("3	SCISSORS");
		int choice;
		choice = in.nextInt();
		if(choice == 1)
		{
			return 1;
		}
		else if(choice == 2)
		{
			return 2;
		}
		else if (choice == 3)
		{
			return 3;
		}
		return 0;
	}
	
	public static int compChoice()
	{
		int compChoice = (int)(Math.random() * 3 + 1);
		return compChoice;
	}
	
	public static int retry()
	{
		int retry;
		System.out.println("If you would like to try again press 1, if not press 2");
		retry = in.nextInt();
		
		return retry;
		
	}
}
