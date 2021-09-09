import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessDemo {
    public static void main(String[] args) {
        var numberGen = new Random();
        var hiddenNumber = numberGen.nextInt(10) + 1;
        var commandLineReader = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10: ");
        var userGuess = commandLineReader.nextInt();
        if (hiddenNumber == userGuess) {
            System.out.println("You guessed it! " + hiddenNumber + " was the right one");
        } else {
            while (userGuess != hiddenNumber) {
                System.out.println("Sorry " + userGuess + " was not my number.");
                if (userGuess - hiddenNumber >0)
                    System.out.println("Your guess was too high!Guess a number between 1 and 10:");
                else
                    System.out.println("Your guess was too low!Guess a number between 1 and 10:");
                userGuess = commandLineReader.nextInt();


            }
            System.out.println("You guessed it! " + hiddenNumber + " was the right one");
        }
    }
}
