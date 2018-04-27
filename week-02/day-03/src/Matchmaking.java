import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        int girlsNumber = girls.size();
        int boysNumber = boys.size();
        int length;
        ArrayList<String> makingMatches = new ArrayList<>();

        if (boysNumber == girlsNumber) {
            length = girlsNumber;
        } else {
            return makingMatches;
        }

        for (int i = 0; i < length; i++) {
            makingMatches.add(girls.get(i));
            makingMatches.add(boys.get(i));
        }
        return makingMatches;
    }
}
