package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;
    private boolean isBucketed;

    public Excavator() {
    }

    public Excavator(String name, String color, int weight, boolean isBucketed) {
        super.setName(name);
        super.setColor(color);
        this.weight = weight;
        this.isBucketed = isBucketed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
