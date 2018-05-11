public class Shifter implements CharSequence {
    private String word;
    private int number;

    public Shifter(String word, int number) {
        this.word = word.substring(number) + word.subSequence(0, number);
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.subSequence(start, end);
    }
}
