import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList(
                "Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
            planetList.add(5,"Saturn");

        //for (String putSaturn : planetList) {
        //   System.out.println(putSaturn);
        //}

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));

        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

    }
    public static String putSaturn(ArrayList<String> planetlist) {
        String  listString= "\"";

        for (String list : planetlist) {
            listString += list + "\" \"";
        }
        listString = listString.substring(0, listString.length() - 1);
        return listString;
    }
}
