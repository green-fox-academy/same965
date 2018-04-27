import java.util.ArrayList;

public class PalindromeSearcher {
    public static void main(String[] args) {
        //Create a function named search palindrome following your current language's style guide.
        // It should take a string, search for palindromes that at least 3 characters long and return
        // a list with the found palindromes.
        //"dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
        //"apple"	[]
        //"racecar"	["racecar", "aceca", "cec"]

        String input = "dog goat dad duck doodle never";
        for (String palindromes: searchPalindrome(input)) {
            System.out.println(palindromes);
        }
    }

    private static ArrayList<String> searchPalindrome(String input) {
        ArrayList<String> foundPalindromes = new ArrayList<String>();
        int length = input.length();

        if (length < 3) {
            return foundPalindromes;
        }

        for (int i = 1; i < length - 1; i++) {
            for (int j = i - 1, k = i + 1; j >= 0 && k < length; j--, k++) {
                if (input.charAt(j) == input.charAt(k)) {
                    if (k - j + 1 >= 3) {
                        foundPalindromes.add(input.substring(j, k + 1));
                    }
                } else {
                    break;
                }
            }
            for (int l = i, m = i + 1; l >= 0 && m < length; l--, m++) {
                if (input.charAt(l) == input.charAt(m)) {
                    if (m - l + 1 > 3) {
                        foundPalindromes.add(input.substring(l, m + 1));
                    }
                } else {
                    break;
                }
            }
        }
        return foundPalindromes;
    }
}
