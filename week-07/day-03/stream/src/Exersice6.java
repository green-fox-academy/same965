import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exersice6 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
                "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities.stream()
                .filter(citi -> citi.startsWith("A") && citi.endsWith("I"))
                .forEach(System.out::println);
    }
}
