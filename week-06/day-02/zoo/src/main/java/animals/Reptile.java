package main.java.animals;

public class Reptile extends Animal {
    public Reptile() {
    }

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
