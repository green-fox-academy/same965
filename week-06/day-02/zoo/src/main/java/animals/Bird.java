package main.java.animals;

public class Bird extends Animal implements Flyable{
    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }


    @Override
    public void land() {
        System.out.println("Legs grounding, wings closing");
    }

    @Override
    public void fly() {
        System.out.println("Wings moving");
    }

    @Override
    public void takeOff() {
        System.out.println("Gathering momentum and wings out");
    }
}
