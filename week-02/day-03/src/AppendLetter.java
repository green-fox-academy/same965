import java.util.ArrayList;
import java.util.Arrays;

public class AppendLetter {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));

        // The output should be: "kutya", "macska", "kacsa", "róka", "halacska"
    }

    public static ArrayList<String> appendA(ArrayList<String> far) {
        for (int i = 0; i < far.size(); i++) {
            far.set(i, far.get(i) + "a");
        }
        return far;
    }
}



