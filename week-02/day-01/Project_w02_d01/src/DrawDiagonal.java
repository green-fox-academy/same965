import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines of the square:");
        int lines = scanner.nextInt();

        for(int i = 1; i <= lines; i++) {
            for(int j = 1; j <= lines; j++){
                if(i == 1 || i == lines || j == 1 || j == i || j == lines){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
