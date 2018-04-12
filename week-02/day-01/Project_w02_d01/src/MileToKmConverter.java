import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the distance in kilometers: ");
        int kilometer = scanner.nextInt();

        double mile = (double) kilometer * 0.6214;
        System.out.println("Distance in mile: " + mile);

    }
}
