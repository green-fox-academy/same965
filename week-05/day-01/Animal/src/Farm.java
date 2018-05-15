import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {
    private List<Animal> animals;
    private int allSlots;

    public Farm() {
        animals = new ArrayList<>();
    }

    public int freeSlots() {
        int freeSlots;
        return freeSlots = allSlots - animals.size();
    }

    public void breed() {
        if (freeSlots() > 0) {
            animals.add(new Animal());
        }
    }

    public void slaughter() {
        int max = 0;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger > max) {
                max = animals.get(i).hunger;
            }
        }

        for (Animal animal : animals) {
            if (animal.hunger == max) {
                animals.remove(animal);
            }
        }
    }
}
