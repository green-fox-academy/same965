import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression");
        System.out.println("Expression format is the following: (operation) (operand) (operand):");
        String input = scanner.nextLine();
        System.out.println(calculate(input));
    }

    private static double calculate(String input) {
        double result = 0.0d;
        String[] expression = input.split(" ");
        String expression1 = expression[0];
        String expression2 = expression[1];
        String expression3 = expression[2];
        char operator = expression1.charAt(0);
        double operand1 = Double.parseDouble(expression2);
        double operand2 = Double.parseDouble(expression3);

        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else if (operator == '*') {
            result = operand1 * operand2;
        } else if (operator == '/') {
            if (operand2 != 0) {
                result = operand1 / operand2;
            } else {
                System.out.println("Divisor can't be 0");
            }
        } else {
            System.out.println("Missing operator");
        }

        return result;
    }
}
