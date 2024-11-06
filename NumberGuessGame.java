import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(150) + 1; 
        int limit = 7;
        int attemLeft = limit; // this can be optmized i think but idk how

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            System.out.print("Guess the number (1-150): ");
            int userGuess = scanner.nextInt();
            
            if (userGuess < 150) {
                System.out.println("no"); // prevent people from guessing more then the largest num
                
            } else if (userGuess > targetNumber) {
                attemLeft--;
                System.out.println("Less than " + userGuess + ". Attempts left: " + attemLeft);
            } else if (userGuess < targetNumber) {
                attemLeft--;
                System.out.println("Greater than " + userGuess + ". Attempts left: " + attemLeft);
            } else {
                System.out.println("correct");
                break;
            }

            if (attemLeft == 0) {
                System.out.println("The correct number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}