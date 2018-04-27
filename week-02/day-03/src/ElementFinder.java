import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> otherList = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 9));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven(otherList));

        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }

    private static String containsSeven(ArrayList<Integer> arrayList) {
        if (arrayList.contains(7)) {
            return "Hoorray";
        } else {
            return "Noooooo";
        }
    }
}
