import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        //Write a program where the program chooses a number between 1 and 100.
        //The player is then asked to enter a guess. If the player guesses wrong, then the program gives feedback
        //and ask to enter an other guess until the guess is correct.
        //Make the range customizable (ask for it before starting the guessing). You can add lives. (optional)
        //Example
        //I've the number between 1-100. You have 5 lives.
        //20
        //Too high. You have 4 lives left.
        //10
        //Too low. You have 3 lives left.
        //15
        //Congratulations. You won!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my number! Please enter the range of numbers you want my number to be between:");
        System.out.println("(like this: minimum maximum  e.g 1 100)");
        String input = scanner.nextLine();
        System.out.println("You will have 5 lives. If you would like more please enter how many plus lives you want (if none, please enter 0).");
        int plusLives = scanner.nextInt();
        guessMyNumber(input, plusLives);
    }

    private static void guessMyNumber(String input, int plusLives) {
        String[] expression = input.split(" ");
        int minimum = Integer.parseInt(expression[0]);
        int maximum = Integer.parseInt(expression[1]);
        int myNumber = minimum + (int)(Math.random() * ((maximum - minimum) + 1));

        Scanner scanner = new Scanner(System.in);
        int numberOfGuess = 5 + plusLives;
        System.out.println("I have the number between " + minimum + "-" + maximum + ". You have " + numberOfGuess + " lives.");

        for (int i = 1; i <= numberOfGuess; i++) {
            int guessLeft = numberOfGuess - i;
            int guess = scanner.nextInt();
            if (guess > myNumber) {
                System.out.println("Too high. You have " + guessLeft + " lives left.");
                if (guessLeft == 0) {
                    System.out.println("My number was " + myNumber + ".");
                }
            } else if (guess < myNumber) {
                System.out.println("Too low. You have " + guessLeft + " lives left.");
                if (guessLeft == 0) {
                    System.out.println("My number was " + myNumber + ".");
                }
            } else {
                System.out.println("Congratulations. You won!");
                break;
            }
        }
    }
}
