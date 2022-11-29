package Drivers;

public abstract class Driver {
    private String fio;
    private boolean hasDriverLicense;
    private int experience;

    public abstract void startMove();
    public abstract void stop();
    public abstract void refill();

    public String validateStringParametrs(String value){
        return value == null || value.isBlank() || value.isEmpty() ? "Иванов Иван Иванович" : value;
    }
    public int validateIntParametrs(int value){
        return value <= 0 ? 1 : Math.abs(value);
    }

    public Driver(String fio, boolean hasDriverLicense, int experience) {
        this.fio = validateStringParametrs(fio);
        this.hasDriverLicense = hasDriverLicense;
        this.experience = validateIntParametrs(experience);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Водитель: %s, со стажем вождения: %d лет. Наличие прав: %b.", getFio(), getExperience(), isHasDriverLicense());
    }

}