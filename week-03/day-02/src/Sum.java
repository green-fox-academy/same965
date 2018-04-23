public class Sum {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        int number = 5;
        int sum = sum(number);
    }

    private static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
