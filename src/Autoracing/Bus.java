package Autoracing;

public class Bus extends Transport implements Competing {
    public enum Capacity {
        EXTRA_SMALL(null, 10), SMALL(null, 25), AVERAGE(40, 50),
        BIG(60, 80), EXTRA_BIG(100, 120);
        Integer minCapacity, maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Вместимость");
            if (minCapacity == null) {
                sb.append(" до ").append(maxCapacity).append(" мест.");
            }
            if (maxCapacity == null) {
                sb.append(" от ").append(minCapacity).append(" мест.");
            } else if (minCapacity != null && maxCapacity != null) {
                sb.append(" от ").append(minCapacity).append(" до ").append(maxCapacity).append(" мест.");
            }
            return sb.toString();
        }

    }

    private Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по ТС " + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Вместимость: " + capacity);
        }
    }

    @Override
    public void startMove() {
        System.out.printf("Автобус %s %s начинает движение.\n", getBrand(), getModel());
    }

    @Override
    public void stopMove() {
        System.out.printf("Автобус %s %s останавливается.\n", getBrand(), getModel());
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " +getBrand() + "" + getModel() + " не нуждается в диагностике");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s заезжает на Pit-stop.\n", getBrand(), getModel());
        System.out.printf("Автобус %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeLap() {
        System.out.printf("Лучшее время автобуса %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1 + Math.random() * (10)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автобуса %s %s  составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.\n", Bus.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }
}

