public class Station {
    private double gasAmount;

    public Station(double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        gasAmount -= car.getCapacity();
        car.setGasAmount(car.getGasAmount() + car.getCapacity());
    }
}
