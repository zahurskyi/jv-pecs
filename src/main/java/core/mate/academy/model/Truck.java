package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int power;
    private int wheels;
    public Truck() {
    }

    public Truck(String name, String color, int power, int wheels) {
        super.setName(name);
        super.setColor(color);
        this.power = power;
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
