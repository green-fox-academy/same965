public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

            // When saving this quote a disk error has occured. Please fix it.
            // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
            // Using pieces of the quote variable (instead of just redefining the string)


        StringBuilder correctQuote = new StringBuilder();
        correctQuote.append(quote,0,20);
        correctQuote.append(" always takes longer than ");
        correctQuote.append(quote,21,quote.length());

        System.out.println(correctQuote);

    }
}
