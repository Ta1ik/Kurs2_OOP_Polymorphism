package Passport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final String numberPassport;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthday;

    public Passport(String numberPassport, String firstName, String lastName, String middleName, LocalDate birthday) {
        this.numberPassport = validateString(numberPassport);
        this.firstName = validateString(firstName);
        this.lastName = validateString(lastName);
        this.middleName = validateString(middleName);
        this.birthday = birthday;
    }

    public void addPassport(Set<Passport> passports) {
        if (passports.contains(this)) {
            passports.remove(this);
            passports.add(new Passport(numberPassport, firstName, lastName, middleName, birthday));
        } else {
            passports.add(this);
        }
    }

    public static Passport findPassportAtNumber(Set<Passport> passports, String number) {
        for (Passport passport : passports) {
            if (passport.getNumberPassport().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    public String validateString(String parameter) {
        if (parameter == null || parameter.isBlank() && parameter.isEmpty()) {
            throw new RuntimeException("Заполните недостающие поля");
        } else {
            return parameter;
        }
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = validateString(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = validateString(lastName);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = validateString(middleName);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport == passport.numberPassport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Паспорт. номер паспорта: " + numberPassport + ", имя " + firstName + ", фамилия: " + lastName + ", отчетство: "
                + middleName + ", дата рождения: " + birthday + ".";
    }
}
