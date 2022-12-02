package Data;

import java.util.Scanner;

public class DataRun {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Введите пароль ещё раз: ");
        String confirmPassword = scanner.nextLine();

        try {
            Data.testLogin(login);
            Data.testPassword(password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
