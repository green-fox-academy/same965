import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < input; i++){
            System.out.println("Enter an integer");
            int askNumber = scanner.nextInt();
            sum += askNumber;
        }

        double average = sum / input;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
