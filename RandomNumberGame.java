import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args){
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1; //Generates number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100! : ");
        int userNumber = scanner.nextInt();

        int guesses = 0;
        while (userNumber != secretNumber && guesses != 10) {
            if (userNumber > secretNumber) {
                System.out.println("Too high!");
                guesses++;
            }
            else {
                System.out.println("Too low!");
                guesses++;
            }
            System.out.println("Guess a number between 1 and 100! : ");
            userNumber = scanner.nextInt();
        }
        if (guesses == 10) {
            System.out.println("You've run out of guesses!");
            System.out.printf("The number was %d", secretNumber);
        }
        System.out.println("You got it!");
        System.out.printf("The number was %d! \n", secretNumber);
        System.out.printf("You guessed it in %d tries!", guesses);
    }
}
