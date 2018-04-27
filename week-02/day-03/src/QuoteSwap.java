import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot",
                                                                     "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    private static String quoteSwap(ArrayList<String> list) {
        int word1 = list.indexOf("do");
        int word2 = list.indexOf("cannot");
        String temp = list.get(word1);
        list.set(word1, list.get(word2));
        list.set(word2, temp);
        String quote = list.toString();
        quote =  quote.replace(",", "").replace("[", "").replace("]", "");
        return quote;
    }
}
