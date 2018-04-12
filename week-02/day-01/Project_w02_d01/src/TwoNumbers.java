public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22
        // Print the result of 13 substracted from 22
        // Print the result of 22 multiplied by 13
        // Print the result of 22 divided by 13 (as a decimal fraction)
        // Print the integer part of 22 divided by 13
        // Print the reminder of 22 divided by 13

        int number1 = 22;
        int number2 = 13;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println((double) number1 / (double) number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);
    }
}
