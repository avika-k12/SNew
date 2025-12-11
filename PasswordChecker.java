import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args){
        String [] words = {"hello","goodbye","adios","bonjour","au revoir"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the password? : ");
        String userInput = scanner.nextLine();
        for (String i : words){
            if (i .equals (userInput)){
                System.out.println("You got it!");
                break;
            }
        }
    }
}
