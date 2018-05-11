public class Main {
    public static void main(String[] args) {
        Gnirts word = new Gnirts("apple");
        System.out.println(word.getWord());
        System.out.println(word.charAt(0) + " " + word.length());
        System.out.println(word.subSequence(0, 3));

        Shifter otherWord = new Shifter("alma", 1);
        System.out.println(otherWord.charAt(0));
        System.out.println(otherWord.subSequence(0, 3));
    }
}
