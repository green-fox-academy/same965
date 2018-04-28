public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        int number = 0;
        try {
            System.out.println(division(number));
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

    public static int division(int number) {
        int result = 10 / number;
        return result;
    }
}
