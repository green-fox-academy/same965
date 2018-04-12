public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        // Surface Area: 600
        // Volume: 1000
        double sideA = 5;
        double sideB = 10;
        double sideC = 15;

        double surfaceArea = 2 * (sideA * sideB + sideA * sideC + sideB * sideC);
        System.out.println("Surface Area: " + surfaceArea);

        double volume = sideA * sideB * sideC;
        System.out.println("Volume: " + volume);
    }
}
