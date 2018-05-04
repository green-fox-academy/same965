public class Sharpie {
    String color;
    float width;
    float inkAmount = 100f;

    public Sharpie () {
    }

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use(float inkUsage) {
        this.inkAmount -= inkUsage;
    }
}
