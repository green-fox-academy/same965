package main.java.music;

public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;

    public StringedInstrument() {
    }

    public StringedInstrument(String name) {
        super(name);
    }

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    public void play() {
        System.out.println(super.getName() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}