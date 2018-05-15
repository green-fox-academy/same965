import java.util.Arrays;

public class IsAnagram {
    private String word1;
    private String word2;

    public IsAnagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean anagram() {
        if (word1.length() != word2.length()) {
            return false;
        }

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] charsWord1 = word1.toCharArray();
        char[] charsWord2 = word2.toCharArray();
        Arrays.sort(charsWord1);
        Arrays.sort(charsWord2);
        String newWord1 = new String(charsWord1);
        String newWord2 = new String(charsWord2);
        return newWord1.equals(newWord2);
    }
}
