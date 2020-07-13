package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 */
public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
