import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        // Example:
        // The number 15 should print:
        // 1 * 15 = 15
        // 10 * 15 = 150

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a (whole) number:");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
