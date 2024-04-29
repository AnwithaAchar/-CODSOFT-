package number_game_task1;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {
public static void guessingNumber()
{
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	System.out.println("Guess the Number within five trials");
	int max = 100;
	int min = 1;
	int totalattempts = 5;// Number of attempts that user has made
	int score = 0;
	int round;
	int totalround = 5;
	for(round = 1; round <= totalround; round++)
	{
		int randomnum = random.nextInt(max - min + 1) + min;
	    for(int attempt = 1; attempt <= totalattempts; attempt++)
	    {
	    	System.out.println("Guess the number");
	    	int userGuessingNumber = sc.nextInt();
	    	if(randomnum == userGuessingNumber)//condition if the guessed number is  equal to user guessed number, it will prints the Congratulations you guessed the number, otherwise it goes to else part
	    	{
	    		System.out.println("Congratulations you guessed the number");
	    		score++;
	    		break;// if we guessed the correct number then the loop will get exit, otherwise it goes to else part and checks whether its is greater than or less than the user guessing number
	    	}
	    	else if(randomnum < userGuessingNumber)//condition
	    	{
	    		System.out.println("Number is less than:"+ userGuessingNumber);
	    	}
	    	else
	    	{
	    		System.out.println("Number is greater than:"+ userGuessingNumber);
	    	}
	    	if(attempt == totalattempts)
	    	{
	    		System.out.println("Sorry, you have run out of attempts");
	    	}
	    }
	    if(round < totalround)
	    {
	    	System.out.println("Do you want to play again? Yes/No");
	    	String playagain = sc.next().toLowerCase();
	    	if(!playagain.equals("yes"))
	    	{
	    		System.out.println(" Game over! Your Score is: " + score);
	    		break;
	    	}
	    }
	}
}
public static void main(String[]args)
{
	guessingNumber();
}
}

