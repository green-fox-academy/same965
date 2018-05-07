public class Plant {
    private String color;
    private double currentWaterAmount;

    public Plant() {
    }

    public Plant(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Double getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(double currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }
}
