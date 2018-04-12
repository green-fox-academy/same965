import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        if (input1 > input2) {
            System.out.println(input1);
        } else if (input1 < input2) {
            System.out.println(input2);
        } else {
            System.out.println("Equals");
        }
    }
}
