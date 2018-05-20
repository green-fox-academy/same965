import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise9 {
    public static void main(String[] args) {
        Character[] characters = {new Character('H'), new Character('e'), new Character('l'),
                new Character('l'), new Character('o')};

        String word = Arrays.stream(characters)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
