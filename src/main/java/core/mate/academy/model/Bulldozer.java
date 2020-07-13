package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 */
public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
