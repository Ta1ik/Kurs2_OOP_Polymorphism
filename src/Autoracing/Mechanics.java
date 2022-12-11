package Autoracing;

import java.util.Objects;

public class Mechanics {
    private final String name;
    private final String lastName;
    private String company;
    private String typeTransport;

    public Mechanics(String name, String lastName, String company, String typeTransport) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
        this.typeTransport = typeTransport;
    }
    public void doTechnicalInspection(Transport transport){
        System.out.println("Проводим техническое обслуживание.");
    }
    public void repairTransport(Transport transport){
        System.out.println("Ремонтируем транспорт.");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics mechanics = (Mechanics) o;
        return name.equals(mechanics.name) && lastName.equals(mechanics.lastName) && company.equals(mechanics.company) && typeTransport.equals(mechanics.typeTransport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, company, typeTransport);
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", фамилия: " + lastName + ", компания: " + company + ", тип обслуживаемого транспорта: " + typeTransport + ".";
    }
}
