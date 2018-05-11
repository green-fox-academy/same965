public class Gnirts implements CharSequence {
    private String word;

    public Gnirts(String string) {
        this.word = string;
    }

    public String gnirts() {
        String gnirts = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            gnirts = gnirts + word.charAt(i);
        }
        return gnirts;
    }

    public String getWord() {
        return gnirts();
    }

    @Override
    public char charAt(int index) {
        return gnirts().charAt(index);
    }

    @Override
    public int length() {
        return gnirts().length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return gnirts().subSequence(start, end);
    }
}
