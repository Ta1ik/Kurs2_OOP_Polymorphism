package Autoracing;

import java.util.Objects;

public class Sponsors {
    private final String name;
    private long sum;

    public Sponsors(String name, long sum) {
        this.name = name;
        if (sum >= 0)
            this.sum = sum;
        else
            throw new IllegalArgumentException("Неверно указана сумма");
    }

    public void sponsoringRace(Transport... transports) {
        System.out.println("Cпонсируем выбранный транспорт на: " + sum + " руб.");
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(long sum) {
        if (sum >= 0)
            this.sum = sum;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsors sponsors = (Sponsors) o;
        return name == sponsors.name && Long.compare(sponsors.sum, sum) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum);
    }

    @Override
    public String toString() {
        return "Имя спонсора: " + name + ", сумма поддержки: " + sum + ".";
    }
}
