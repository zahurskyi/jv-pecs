package core.mate.academy.service;

import static org.junit.Assert.*;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceTest {
    private static MachineService<Machine> machineService;

    @BeforeClass
    public static void beforeClass() {
        machineService = new MachineServiceImpl();
    }

    @Test
    public void getAll_bulldozerType() {
        List<Machine> actual = machineService.getAll(Bulldozer.class);
        assertEquals("The list should contain elements of type Bulldozer",
                Bulldozer.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_excavatorType() {
        List<Machine> actual = machineService.getAll(Excavator.class);
        assertEquals("The list should contain elements of type Excavator",
                Excavator.class, actual.get(0).getClass());
    }

    @Test
    public void getAll_trackType() {
        List<Machine> actual = machineService.getAll(Truck.class);
        assertEquals("The list should contain elements of type Track",
                Truck.class, actual.get(0).getClass());
    }

    @Test
    public void fill_bulldozerValue() {
        List<Object> machines = new ArrayList<>(List.of(new Object(), new Object(), new Object()));
        machineService.fill(machines, new Bulldozer());
        assertEquals("The list initial size should double", 6, machines.size());
        assertEquals("The list should contain elements of type Bulldozer",
                Bulldozer.class, machines.get(0).getClass());
    }

    @Test
    public void fill_excavatorValue() {
        List<Object> machines = new ArrayList<>(List.of(new Object(), new Object(), new Object()));
        machineService.fill(machines, new Excavator());
        assertEquals("The list initial size should double", 6, machines.size());
        assertEquals("The list should contain elements of type Excavator",
                Excavator.class, machines.get(0).getClass());
    }

    @Test
    public void fill_trackValue() {
        List<Object> machines = new ArrayList<>(List.of(new Object(), new Object(), new Object()));
        machineService.fill(machines, new Truck());
        assertEquals("The list initial size should double", 6, machines.size());
        assertEquals("The list should contain elements of type Track",
                Truck.class, machines.get(0).getClass());
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_bulldozers() {
        List<Bulldozer> bulldozers = List.of(new Bulldozer());
        machineService.startWorking(bulldozers);
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_excavators() {
        List<Excavator> excavators = List.of(new Excavator());
        machineService.startWorking(excavators);
    }

    /**
     * This test will compile in case of proper solution
     */
    @Test
    public void startWorking_tracks() {
        List<Truck> trucks = List.of(new Truck());
        machineService.startWorking(trucks);
    }
}
