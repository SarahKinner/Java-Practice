//Number guessing game
import java.util.Scanner;

public class Conditionals {
    //Make scanner object
    Scanner myObj = new Scanner(System.in);

    //Add variables
    int SecretNumber = 0;
    int UserGuess = 0;

    //Randomly generate the number that needs to be guessed
    SecretNumber = (int)(Math.random() * 10) + 1;

    //Print that says Im thinking of a number between 1-10
    System.out.println("I'm thinking of a number between 1-10");

    //Ask the user to guess the number
    System.out.println("Please guess the number");

    //User inputs the number they guess
    UserGuess = myObj.nextInt();

    //What happens if user guesses too high

    //What happens if user guesses too low

    //What happens if user guesses correctly
}
