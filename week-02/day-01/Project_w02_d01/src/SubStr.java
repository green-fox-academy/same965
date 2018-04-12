import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //public static void main(String[] args) {
            //  Create a function that takes two strings as a parameter
            //  Returns the starting index where the second one is starting in the first one
            //  Returns `-1` if the second string is not in the first one
            //  Example:
            //System.out.println(subStr("this is what I'm searching in", "searching"));
            //  should print: `17`
            //System.out.println(subStr("this is what I'm searching in", "not"));
            //  should print: `-1`

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string");
            String input = scanner.nextLine();
            System.out.println("Enter a string to search it in the first string");
            String q = scanner.nextLine();

            System.out.println(subStr(input, q));
        }

    public static int subStr(String input, String q) {
        int lengthI = input.length();
        int lengthQ = q.length();
        int index = -1;
        int j = 0;

        if(lengthQ >= 0) {
            for(int i = 0; i <= lengthI; i++) {
                if(input.charAt(i) == q.charAt(j)) {
                    j++;
                    if(j == lengthQ) {
                        return i - lengthQ + 1;
                    }
                } else {
                    j = 0;
                }
            }
        }
        return -1;
    }
}
