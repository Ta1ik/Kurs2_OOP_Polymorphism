package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import static Passport.Passport.findPassportAtNumber;

public class RunPassport {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        Passport ivanov = new Passport("1234", "����", "������", "��������", LocalDate.now().minusYears(45));
        Passport petrov = new Passport("1234", "����", "������", "��������", LocalDate.now().minusYears(40));
        Passport stepanov = new Passport("5678", "������", "��������", "����������", LocalDate.now().minusYears(30));
        ivanov.addPassport(passports);
        petrov.addPassport(passports);
        stepanov.addPassport(passports);

        findPassportAtNumber(passports, "1234");
        System.out.println(passports);

    }
}
