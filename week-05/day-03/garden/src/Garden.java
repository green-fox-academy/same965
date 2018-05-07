import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> garden;

    public Garden() {
        this.garden = new ArrayList<>();
    }

    public void fillGarden() {
        Flower flower1 = new Flower("yellow");
        garden.add(flower1);
        Flower flower2 = new Flower("blue");
        garden.add(flower2);
        Tree tree1 = new Tree("purple");
        garden.add(tree1);
        Tree tree2 = new Tree("orange");
        garden.add(tree2);
    }

    public void showGarden() {
        List<String> gardenDetails = new ArrayList<>();

        for (Plant plantStatus : garden) {
            if (plantStatus instanceof Flower) {
                gardenDetails.add(plantStatus.toString());
            } else if (plantStatus instanceof Tree) {
                gardenDetails.add(plantStatus.toString());
           }
        }
        gardenDetails.forEach(System.out::println);
    }

    public void waterGarden(double waterAmount) {
        List<Plant> thirstyGarden = new ArrayList<>();
        thirstyGarden(thirstyGarden);

        System.out.println();
        System.out.println("Watering with " + waterAmount);

        for (Plant wateringPlants : thirstyGarden) {
            if (wateringPlants instanceof Flower) {
                ((Flower) wateringPlants).wateringFlower((waterAmount / garden.size()));
            } else if (wateringPlants instanceof Tree) {
                ((Tree) wateringPlants).wateringTree((waterAmount / garden.size()));
            }
        }
        showGarden();
    }

    public void thirstyGarden (List<Plant> thirstyGarden) {
        for (Plant thirsty : garden) {
            if (thirsty instanceof Flower) {
                if (((Flower) thirsty).flowerNeedWater()){
                    thirstyGarden.add(thirsty);
                }
            } else if (thirsty instanceof Tree) {
                if (((Tree) thirsty).treeNeedWater()) {
                    thirstyGarden.add(thirsty);
                }
            }
        }
    }
}
