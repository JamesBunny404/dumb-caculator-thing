import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(150) + 1; 
        int limit = 7;
        int attemptLeft = limit; // this can be optmized i think but idk how

        Scanner scanner = new Scanner(System.in);

        while (attemptLeft > 0) {
            System.out.print("Guess the number (1-150): ");
            int userGuess = scanner.nextInt();
            
            if (userGuess < 150) {
                System.out.println("no"); // prevent people from guessing more then the largest num
                
            } else if (userGuess > targetNumber) {
                attemptLeft--;
                System.out.println("Less than " + userGuess + ". Attempts left: " + attemptLeft);
            } else if (userGuess < targetNumber) {
                attemptLeft--;
                System.out.println("Greater than " + userGuess + ". Attempts left: " + attemptLeft);
            } else {
                System.out.println("correct");
                break;
            }

            if (attemptLeft == 0) {
                System.out.println("The correct number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
