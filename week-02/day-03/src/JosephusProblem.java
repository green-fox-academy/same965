import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        //Write a function to solve Josephus Problem. The program should ask for a number, this number represents how
        // many people are in the "game". The return value should be the number of the "winning" seat.

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people in the game? PLease, enter the number.");
        int peopleInGame = scanner.nextInt();
        System.out.println("The number of the winning seat is " + josephus(peopleInGame));
    }

    private static int josephus(int peopleInGame) {
        int winningSeat = 0;
        int distance = 2;
        int firstPosition = 1;
        ArrayList<Integer> people = new ArrayList<Integer>();
        for (int i = 0; i < peopleInGame; i++) {
            people.add(i, i + 1);
        }

        if (peopleInGame == 1) {
            winningSeat = 1;
        } else {
            int index = (firstPosition - 2) % peopleInGame;
            for (int i = peopleInGame; i > 1; i--) {
                index = (index + distance) % peopleInGame--;
                people.remove(index--);
            }
        }

        winningSeat = people.get(0);
        return winningSeat;
    }
}
