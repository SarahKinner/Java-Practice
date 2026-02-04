//Random drawing/lottery program
import java.util.Scanner;
import java.util.ArrayList;

public class Random_Drawing {
    public static void main(String[] args) {
    //Make scanner object
    Scanner myObj = new Scanner(System.in);

    //Make the array list
    ArrayList<String> person = new ArrayList<String>();

    //Ask the user to input the names
    System.out.println("Enter names for the lottery (Type 'done' when you are finished)");

    //Read the users input
    while (true) {
        String name = myObj.nextLine();

        //Basically checks if the user inputted done and if so it'll exit out of the loop
        if (name.equalsIgnoreCase("done")) {
            break;
        }

        people.add(name);
    }

    //Draw a random winner from the array list

    //Print out the winner
    }
}

