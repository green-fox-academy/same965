import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);

        int myNumber = 8;
        System.out.println("Guess my number");
        int guess = scanner.nextInt();

        while (guess != myNumber) {
            if (guess > myNumber) {
                System.out.println("The stored number is lower");
                guess = scanner.nextInt();
            }
            else {
                System.out.println("The stored number is higher");
                guess = scanner.nextInt();
            }
        }

        System.out.println("You found the number: " + myNumber);
    }
}
