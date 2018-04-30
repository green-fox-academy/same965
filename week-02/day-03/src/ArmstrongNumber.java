import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
        //Write a simple program to check if a given number is an armstrong number. The program should ask for a number.
        //E.g. if we type 371, the program should print out: The 371 is an Armstrong number.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a (natural) number to check whether it is an Armstrong number");
        int input = scanner.nextInt();
        System.out.println(input + armstrong(input) + " an Armstrong number.");
    }

    private static String armstrong(int input) {
        int digitNumber = (int)(Math.log10(input)+1);
        int[] digits = new int[digitNumber];
        int number = input;

        for (int i = digitNumber - 1; i >= 0 ; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        int sum = 0;
        for (int j = 0; j < digits.length; j++) {
            sum += Math.pow(digits[j], digitNumber);
        }

        if (sum == input) {
            return " is";
        } else {
            return " is not";
        }
    }
}
