public class Factorio {
    public static void main(String[] args) {
        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int input = 5;
        int factorial = factorio(input);

    }

    private static int factorio(int input) {
        int factorio = 1;

        for (int i = 1; i <= input; i++) {
            factorio *= i;
        }

        return factorio;
    }
}
