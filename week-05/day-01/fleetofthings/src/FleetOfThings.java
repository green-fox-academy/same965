import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        stand.complete();
        Thing lunch = new Thing("Eat lunch");
        lunch.complete();

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(stand);
        fleet.add(lunch);

        System.out.println(fleet);

        fleet.sorting();
        System.out.println(fleet);
    }
}
