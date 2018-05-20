public class Exercise5 {
    public static void main(String[] args) {
        String s = "HelloHello";

        s.chars()
                .filter(c -> (char) c >= 'A' && c <= 'Z')
                .forEach(c -> System.out.println((char)c));

    }
}
