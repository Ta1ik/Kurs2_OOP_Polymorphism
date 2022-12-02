package Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    public static boolean testLogin(String login) throws WrongLoginException {
        if (Pattern.matches("[\\w]{1,20}", login)) {
            return true;
        } else {
            throw new WrongLoginException("Неверно указан логин");
        }
    }

    public static boolean testPassword(String password, String confirmPassword) throws WrongPasswordException {
        Pattern pattern = Pattern.compile("\\w{1,20}");
        Matcher pass = pattern.matcher(password);
        Matcher confPass = pattern.matcher(confirmPassword);
        if (password.equals(confirmPassword) && pass.matches() && confPass.matches()) {
            return true;
        } else {
            throw new WrongPasswordException("Некорректный пароль.");
        }
    }
}
