public class PalindromeBuilder {
    public static void main(String[] args) {
        //Create a function named create palindrome following your current language's style guide.
        //It should take a string, create a palindrome from it and then return it.
        //"greenfox"	"greenfoxxofneerg", "123"	"123321"

        String original = "greenfox";
        System.out.println(createPalindrome(original));
    }
    private static String createPalindrome(String original) {
        String otherSide = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            otherSide = otherSide + original.charAt(i);
        }
        return original + otherSide;
    }
}
