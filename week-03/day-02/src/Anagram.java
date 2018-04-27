import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Create a function named is anagram following your current language's style guide.
        // It should take two strings and return a boolean value depending on whether its an anagram or not.

        String a = "dog";
        String b = "god";

        boolean isAnagram = anagram(a,b);
        System.out.println(isAnagram);
    }

    private static boolean anagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        String a2 = new String(a1);
        String b2 = new String(b1);
        return a2.equals(b2);
    }
}
