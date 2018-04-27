import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    private static String advancedBubble(int[] numbers, boolean descending) {
       Arrays.sort(numbers);
       String sortedNumbers = "";
       if(descending == true) {
            for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - i - 1];
                numbers[numbers.length - i - 1] = temp;
                sortedNumbers = Arrays.toString(numbers);
            }
        } else{
            sortedNumbers = Arrays.toString(numbers);
        }
        return sortedNumbers;
    }

    private static String bubble(int[] numbers) {
        Arrays.sort(numbers);
        String sortedNumbers = Arrays.toString(numbers);
        return sortedNumbers;
    }
}