//Number guessing game
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Make scanner object
        Scanner myObj = new Scanner(System.in);

        //Add variables
        int SecretNumber = 0;
        int UserGuess = 0;

        //Randomly generate the number that needs to be guessed
        SecretNumber = (int)(Math.random() * 10) + 1;

        //Print that says Im thinking of a number between 1-10
        System.out.println("I'm thinking of a number between 1-10");

        //Make a loop so user can guess again and again until they get it correct
        while (UserGuess != SecretNumber) {
            //Ask the user to guess the number
            System.out.println("Please guess the number");

            //User inputs the number they guess
            UserGuess = myObj.nextInt();

            //if, else if, else conditional that'll deal with if number guessed is too high, low, or correct
            if (UserGuess > SecretNumber){
                System.out.println("You guessed too high! Try again!");
            } else if (UserGuess < SecretNumber){
                System.out.println("You guessed too low! Try again!");
            } else {
                System.out.println("Correct! You got it!");
            }
        }

        //Closes the scanner that I made
        myObj.close();
    }
}