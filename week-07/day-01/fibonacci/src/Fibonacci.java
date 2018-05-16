import java.nio.file.Files;

public class Fibonacci {
    int index;

    public Fibonacci() {
    }

    public long fibonacciMember(int index) {
        long indexMinus1 = 0L;
        long indexMinus2 = 1L;
        long result = 0L;

        if (index == 0) {
            return 0L;
        } else if (index == 1) {
            return 1L;
        }

        for (int i = 2; i <= index; i++) {
            result = indexMinus2 + indexMinus1;
            indexMinus2 = indexMinus1;
            indexMinus1 = result;
        }

        return result;
    }
}
