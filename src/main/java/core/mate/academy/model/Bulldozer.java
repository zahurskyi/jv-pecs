package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year, int horsePower) {
        super.setName(name);
        super.setColor(color);
        this.year = year;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
