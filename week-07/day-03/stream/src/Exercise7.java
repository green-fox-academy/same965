public class Exercise7 {
    public static void main(String[] args) {
        String s = "apple";
        char character = 'p';

        System.out.println(s.chars()
                .filter(c -> (char) c == character)
                .count()
                );
    }
}
