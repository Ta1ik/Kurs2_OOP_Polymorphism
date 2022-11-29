package Autoracing;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.printf("Грузовик %s %s начинает движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMove() {
        System.out.printf("Грузовик %s %s останавливается.\n", getBrand(), getModel());
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.", Truck.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nГрузовик %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeLap() {
        System.out.printf("Лучшее время грузовика %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1 + Math.random() * (15)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость грузовика  %s %s составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }
}
