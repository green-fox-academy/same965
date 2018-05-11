package main.java.music;

public abstract class Instrument {
    private String name;

    public Instrument() {
    }

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void play();

}
