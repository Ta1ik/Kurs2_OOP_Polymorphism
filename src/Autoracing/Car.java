package Autoracing;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.printf("Автомобиль %s %s начинает движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMove() {
        System.out.printf("Автомобиль %s %s останавливается.\n", getBrand(), getModel());
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f лс.", Car.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s заезжает на Pit-stop.", getBrand(), getModel());
        System.out.printf("\nАвтомобиль %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeLap() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1+ Math.random() * (5)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля  %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * 200));
    }
}
