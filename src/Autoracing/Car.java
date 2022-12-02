package Autoracing;

public class Car extends Transport implements Competing {

    public enum BodyType {
        SEDAN("седан"), HATCHBACK("хетчбек"), COUPE("купе"), UNIVERSAL("универсал"), SUV("внедорожник"),
        CROSSOVER("купе"), PICKUP("пикап"), VAN("грузовик"), MINIVAN("минивен");

        String translate;

        BodyType(String translate) {
            this.translate = translate;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + translate + ".";
        }
    }

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    private BodyType bodyType;

    private boolean diagnostic;

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по ТС " + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Автомобиль: " + getBrand() + " " + getModel() + ". " + bodyType);
        }

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
    public boolean passDiagnostics() {
        if (diagnostic) {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s заезжает на Pit-stop.\n", getBrand(), getModel());
        System.out.printf("Автомобиль %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeLap() {
        System.out.printf("Лучшее время автомобиля %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1 + Math.random() * (5)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автомобиля  %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * 200));
    }

    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя: %.1f лс.\n", Car.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }

}
