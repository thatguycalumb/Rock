import java.util.Scanner;
import java.util.Random;

class Rock
{
	public static void main(String args[])
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		boolean repeat = false;
		
		String userString;
		String compString;
		
		do
		{
			System.out.print("Input Rock, Paper or Scissors (r/p/s): ");
		
			char userChar = scan.next().charAt(0);
		
			if(userChar == 'r') userString = "Rock";
			else if(userChar == 'p') userString = "Paper";
			else if(userChar == 's') userString = "Scissors";
			else userString = "Nope";
		
			int compInt = rand.nextInt(3)+1;
			
			if(compInt == 1) compString = "Rock";
			else if(compInt == 2) compString = "Paper";
			else if(compInt == 3) compString = "Scissors";
			else compString = "Nope";
		
		
			System.out.println("Your said: " + userString);
			System.out.println("Comp said: " + compString);
			
			if(userString == compString) System.out.println("\nShoot again\n");
			else repeat = true;
		} while(repeat != true);
		
			 if((userString == "Rock") && (compString == "Paper")) System.out.println("\nYou Lose!");
		else if((userString == "Rock") && (compString == "Scissors")) System.out.println("\nYou Win!");
		
		else if((userString == "Paper") && (compString == "Rock")) System.out.println("\nYou Win!");
		else if((userString == "Paper") && (compString == "Scissors")) System.out.println("\nYou Lose");
		
		else if((userString == "Scissors") && (compString == "Paper")) System.out.println("\nYou Win!");
		else if((userString == "Scissors") && (compString == "Rock")) System.out.println("\nYou Lose");
	}
}