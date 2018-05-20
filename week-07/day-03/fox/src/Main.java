import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Fox greenFox = new Fox("Green Fox", "pallida", "green");
        Fox pelevinFox = new Fox("A-Huli", "metamor", "red");
        Fox exuperyFox = new Fox("Little Prince's Fox", "alien", "red");
        Fox laFontaineFox = new Fox("Renard", "cunning", "grey");
        Fox feketeFox = new Fox("Vuk", "little fox", "red");

        ArrayList<Fox> foxes = new ArrayList<>();
        foxes.add(greenFox);
        foxes.add(pelevinFox);
        foxes.add(exuperyFox);
        foxes.add(laFontaineFox);
        foxes.add(feketeFox);

        List<Fox> green = foxes.stream()
                .filter(fox -> fox.getColor() == "green")
                .collect(Collectors.toList());

        foxes.stream()
                .filter(fox -> fox.getColor() == "green" && fox.getType() == "pallida")
                .collect(Collectors.toList())
                .forEach(fox -> System.out.println(fox.getName()));
    }
}
