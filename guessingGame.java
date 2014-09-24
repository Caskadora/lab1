import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		//needed objects
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		//number for the player to guess
		int numberToGuess = r.nextInt(10);

		System.out.println("Guess an integer between 0 and 10!");
		int myInt = s.nextInt();
		if(myInt == numberToGuess)
		{
			System.out.println("You got it!");
		}
		else
		{
			System.out.println("Not quite... the number was " + numberToGuess);
		}

	}
}
