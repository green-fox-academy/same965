import java.util.HashMap;

public class CountLetters {
    private String input;

    public CountLetters() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public HashMap countLetter(String input) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for (char character : input.toLowerCase().toCharArray()) {
            Integer charCount = dictionary.get(character);
            if (charCount == null) {
                charCount = 0;
            }
            dictionary.put(character, charCount + 1);
        }
        return dictionary;
    }
}
