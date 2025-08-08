package Fan;

public class FanClass {
    int speed;
    String color;
    String brand;
    int Blades;

    public FanClass(int speed, String color, String brand, int blades) {
        this.speed = speed;
        this.color = color;
        this.brand = brand;
        Blades = blades;
    }

    public FanClass() {
    }

    @Override
    public String toString() {
        return "FanClass{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", Blades=" + Blades +
                '}';
    }
}
