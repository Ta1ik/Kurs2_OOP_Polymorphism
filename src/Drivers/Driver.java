package Drivers;

public abstract class Driver {
    private String fio;
    private String typeDriverLicense;
    private int experience;

    public abstract void startMove();

    public abstract void stop();

    public abstract void refill();

    public void testLic() {
        if (!getTypeDriverLicense().isBlank() || !getTypeDriverLicense().isEmpty()) {
            System.out.println("Тип прав для данного водителя: " + getTypeDriverLicense() + ".");
        } else {
            throw new RuntimeException("Необходимо указать тип прав!");
        }
    }

    public String validateStringParametrs(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "default" : value;
    }

    public int validateIntParametrs(int value) {
        return value <= 0 ? 1 : Math.abs(value);
    }

    public Driver(String fio, String typeDriverLicense, int experience) {
        this.fio = validateStringParametrs(fio);
        this.typeDriverLicense = typeDriverLicense;
        this.experience = validateIntParametrs(experience);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTypeDriverLicense() {
        return typeDriverLicense;
    }

    public void setTypeDriverLicense(String typeDriverLicense) {
        this.typeDriverLicense = validateStringParametrs(typeDriverLicense);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = validateIntParametrs(experience);
    }

    @Override
    public String toString() {
        return String.format("Водитель: %s, со стажем вождения: %d лет. Наличие прав: %s.", getFio(), getExperience(), getTypeDriverLicense());
    }

}