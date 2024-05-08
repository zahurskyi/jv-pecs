package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private static final int MAX_WEIGHT = 5000;
    private Random random = new Random();

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("JCB", "Yellow",
                random.nextInt(MAX_WEIGHT), true),
                new Excavator("Volvo", "Blue",
                        random.nextInt(MAX_WEIGHT), false),
                new Excavator("New Holland", "Black",
                        random.nextInt(MAX_WEIGHT), true));
    }
}
