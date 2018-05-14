public abstract class Vehicle {
    private String name;
    private String fuelType;
    private int kilometersTravelled;

    public Vehicle(){
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getKilometersTravelled() {
        return kilometersTravelled;
    }

    public void setKilometersTravelled(int kilometersTravelled) {
        this.kilometersTravelled = kilometersTravelled;
    }
}
