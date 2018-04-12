import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        // The diamond should have as many lines as the number was
        // if the number is even the middle line is drawn twice

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines of the diamond:");
        int input = scanner.nextInt();
        int lines = input / 2;

        for(int i = 1; i <= lines; i++) {
            for (int j = lines; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(lines == 1) {
            int i = 0;
            while (i < input) {
                System.out.print("*");
                i++;
            }
            System.out.println();
        }

        for(int i = lines; i > 0; i--) {
            for(int j = 1; j <= lines - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
