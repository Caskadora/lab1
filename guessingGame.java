import java.util.*;

public class guessingGame
{
	public static void main(String args[])
	{
		//needed objects
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		//number for the player to guess
		int numberToGuess = r.nextInt(10);

		int myInt = -1;
		int guesses = 0;
		
		while(myInt != numberToGuess)
		{
			System.out.println("Guess an integer between 0 and 10!");
			myInt = s.nextInt();
			if(myInt == numberToGuess)
			{
				guesses++;
				System.out.println("You got it--and it took you "+guesses+" guesses!");
				break;
			}
			else
			{
				System.out.println("Not quite... guess again!");
				guesses++;
			}
		}

	}
}
