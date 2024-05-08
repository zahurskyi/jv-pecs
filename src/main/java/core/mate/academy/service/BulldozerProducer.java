package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final int MAX_YEAR = 20;
    private static final int MAX_HORSE_POWER = 200;
    private Random random = new Random();

    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Case", "Black",
                random.nextInt(MAX_YEAR), random.nextInt(MAX_HORSE_POWER)),
                new Bulldozer("John Deere", "Red",
                        random.nextInt(MAX_YEAR), random.nextInt(MAX_HORSE_POWER)),
                new Bulldozer("Shantui", "Brown",
                        random.nextInt(MAX_YEAR), random.nextInt(MAX_HORSE_POWER)));
    }
}
