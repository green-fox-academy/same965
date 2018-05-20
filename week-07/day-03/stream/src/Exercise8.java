import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        int number = 7;
        long frequency = numbers.stream()
                .filter(n -> n.equals(number))
                .count();
    }
}
