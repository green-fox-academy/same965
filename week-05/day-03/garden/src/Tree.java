public class Tree extends Plant {
    boolean needWater;

    public Tree() {
    }

    public Tree(String color) {
        super(color);
    }

    public boolean treeNeedWater() {
        needWater = super.getCurrentWaterAmount() < 10.0d;
        return needWater;
    }

    public String needWatering() {
        if (!treeNeedWater()) {
            return "doesn't need water.";
        }
        return "needs water.";
    }

    public void wateringTree (double waterAmount) {
        super.setCurrentWaterAmount(super.getCurrentWaterAmount() + ( waterAmount * 0.4));
    }

    @Override
    public String toString() {
        return ("The " + super.getColor() + " Tree " + needWatering());
    }
}
