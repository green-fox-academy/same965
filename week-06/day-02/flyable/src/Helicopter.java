public class Helicopter extends Vehicle implements Flyable {
    public Helicopter(String name) {
        super("Helicopter");
    }

    @Override
    public void land() {
        System.out.println("Helicopter landed");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter took off");
    }
}
