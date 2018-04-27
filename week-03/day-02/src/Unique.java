import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        int[] numberList = {1, 11, 34, 11, 52, 61, 1, 34};
        Arrays.sort(numberList);
        unique(numberList);
    }

    public static void unique(int[] numberList) {
        for (int i = 0; i < numberList.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (numberList[i] == numberList[j]) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                System.out.print(numberList[i] + " ");
            }
        }
    }
}
