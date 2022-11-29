package Drivers;

import Autoracing.Truck;

public class DriverC <C extends Truck> extends Driver{

    public DriverC(String fio, boolean hasDriverLicense, int experience) {
        super(fio, hasDriverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.printf("Водитель грузового автомобиля %s разгоняется.\n", getFio());
    }

    @Override
    public void stop() {
        System.out.printf("Водитель грузового автомобиля %s тормозит.\n", getFio());
    }

    @Override
    public void refill() {
        System.out.printf("Водитель %s заправляет грузовой авто.\n", getFio());
    }

    public void driverInfo(C truck) {
        System.out.printf("Водитель %s, управляет автомобилем %s %s и будет участвовать в заезде.\n", getFio(), truck.getBrand(), truck.getModel());
    }
}
