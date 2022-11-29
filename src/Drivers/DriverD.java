package Drivers;

import Autoracing.Bus;
public class DriverD <D extends Bus> extends Driver{

    public DriverD(String fio, boolean hasDriverLicense, int experience) {
        super(fio, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.printf("Водитель автобуса %s разгоняется.\n", getFio());
    }

    @Override
    public void stop() {
        System.out.printf("Водитель автобуса %s тормозит.\n", getFio());
    }

    @Override
    public void refill() {
        System.out.printf("Водитель %s заправляет авто.\n", getFio());
    }

    public void driverInfo(D bus) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFio(), bus.getBrand(), bus.getModel());
    }
}

