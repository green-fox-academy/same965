public class Flower extends Plant {
    boolean needWater;

    public Flower() {
    }

    public Flower(String color) {
        super(color);
    }

    public boolean flowerNeedWater() {
        needWater = super.getCurrentWaterAmount() < 5.0d;
        return needWater;
    }

    public String needWatering() {
        if (!flowerNeedWater()) {
            return "doesn't need water.";
        }
        return "needs water.";
    }

    public void wateringFlower (double waterAmount) {
        super.setCurrentWaterAmount(super.getCurrentWaterAmount() + (waterAmount * 0.75));
    }

    @Override
    public String toString() {
        return ("The " + super.getColor() + " Flower "+ needWatering());
    }
}


