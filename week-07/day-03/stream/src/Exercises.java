import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        List<Integer> evens = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        double oddAverage = numbers.stream()
                .filter(number -> (number & 1) == 1)
                .mapToInt(number -> number.intValue())
                .average()
                .getAsDouble();

        long[] squarePositive = numbers.stream()
                .filter(number -> number > 0)
                .mapToLong(number -> number * number)
                .toArray();

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        List<Integer> squareMax20 = numbers2.stream()
                .filter(number -> (number * number) > 20)
                .collect(Collectors.toList());
    }
}
