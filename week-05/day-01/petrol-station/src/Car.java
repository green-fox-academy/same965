public class Car {
    private double gasAmount;
    private double capacity;

    public Car() {
        this(0.0d, 100.0d);
    }

    public Car(double gasAmount, double capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(double gasAmount) {
        this.gasAmount = gasAmount;
    }
}
