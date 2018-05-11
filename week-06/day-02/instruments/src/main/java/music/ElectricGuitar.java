package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar () {
        super("Electric Guitar", 6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar");
        super.setNumberOfStrings(6);
    }

    @Override
    public String sound() {
            return "Twang";
    }

}
