package Autoracing;

public class Truck extends Transport implements Competing {
    public enum LoadCapacity {
        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);
        Float minCapacity, maxCapacity;

        LoadCapacity(Float minCapacity, Float maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Грузоподьемность");
            if (minCapacity == null) {
                sb.append(" до ").append(maxCapacity).append(" т.");
            }
            if (maxCapacity == null) {
                sb.append(" от ").append(minCapacity).append(" т.");
            } else if (minCapacity != null && maxCapacity != null) {
                sb.append(" от ").append(minCapacity).append(" до ").append(maxCapacity).append(" т.");
            }
            return sb.toString();
        }
    }

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    private LoadCapacity loadCapacity;
    private boolean diagnostic;

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по ТС " + getBrand() + " " + getModel() + " недостаточно.");
        } else {
            System.out.println("Грузоподьемность: " + loadCapacity);
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public boolean passDiagnostics() {
        if (diagnostic) {
            System.out.println("Грузовик " + getBrand() + " " + getModel() + " прошел диагностику.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s заезжает на Pit-stop.\n", getBrand(), getModel());
        System.out.printf("Грузовик %s %s прошел обслуживание, выезжает из Pit-stop.\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeLap() {
        System.out.printf("Лучшее время грузовика %s %s составляет: %.0f минут(ы).\n", getBrand(), getModel(), (1 + Math.random() * (15)));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость грузовика  %s %s составила: %.1f км/ч.\n", getBrand(), getModel(), (100 + Math.random() * (100)));
    }

    public boolean isDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(boolean diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return String.format("Класс: %s, марка: %s, модель: %s, мощность двигателя %.1fлс.\n", Truck.class.getSimpleName(), getBrand(), getModel(), getEngineVolume());
    }
}
