package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int MAX_POWER = 10000;
    private static final int MAX_WHEELS = 16;
    private Random random = new Random();

    @Override
    public List<Truck> get() {
        return List.of(new Truck("MAN", "Orange",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WHEELS)),
                new Truck("Iveco", "Purple",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WHEELS)),
                new Truck("Nissan", "White",
                        random.nextInt(MAX_POWER), random.nextInt(MAX_WHEELS)));
    }
}
