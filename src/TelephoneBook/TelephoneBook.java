package TelephoneBook;

import java.util.HashMap;

public class TelephoneBook {

    public static void main(String [] args) {
        HashMap<String, String> telephones = new HashMap<>();
        telephones.put("Иванов Иван","89990785500");
        telephones.put("Петров Иван","89990785501");
        telephones.put("Петров Петр","89990785502");
        telephones.put("Иванов Степан","89990785503");
        telephones.put("Степанов Степан","89990785504");
        telephones.put("Степанов Петр","89990785505");
        telephones.put("Петров Степан","89990785506");
        telephones.put("Алексеев Алексей","89990785507");
        telephones.put("Александров Александр","89990785508");
        telephones.put("Александрова Александра","89990785509");
        telephones.put("Марьина Мария","89990785510");
        telephones.put("Семенова Ольга","89990785511");
        telephones.put("Котова Лилия","89990785512");
        telephones.put("Татьянина Татьяна","89990785513");
        telephones.put("Тропина Надежда","89990785514");
        telephones.put("Пасюкова Галина","89990785515");
        telephones.put("Петрова Ольга","89990785516");
        telephones.put("Иванов Герман","89990785517");
        telephones.put("Селезнева Оксана","89990785518");
        telephones.put("Коснырев Игорь","89990785519");

        System.out.println(telephones);
    }
}
