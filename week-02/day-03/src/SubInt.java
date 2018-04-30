import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static ArrayList<Integer> subInt(int number, int[] list) {
        ArrayList<Integer> indices = new ArrayList<Integer>();

        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < 10; j++) {
                int temp = (int) (list[i] - number * Math.pow(10, j));
                if ((list[i] == number) || list[i] % 10 == number || 0 <= temp && temp < 10) {
                    indices.add(i);
                    break;
                }
            }
            if ( list[i] > Math.pow(10, 20)) {
                System.out.println("Too big number is in the list!");
            }
        }
        return indices;
    }
}
