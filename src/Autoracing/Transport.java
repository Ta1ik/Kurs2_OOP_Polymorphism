package Autoracing;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = validateStringParametrs(brand);
        this.model = validateStringParametrs(model);
        this.engineVolume = validateFloatParametrs(engineVolume);
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void printType();

    public String validateStringParametrs(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public float validateFloatParametrs(float value) {
        return value <= 0 ? 1.5f : Math.abs(value);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}