package Supermarket;

public class RunSupermarket {
    public static void main(String[] args){
        Supermarket supermarket = new Supermarket();
        String person1 = "Геннадий";
        String person2 = "Степан";
        String person3 = "Дмитрий";
        String person4 = "Владимир";
        String person5 = "Влад";
        String person6 = "Галина";
        String person7 = "Надежда";
        String person8 = "Ольга";
        String person9 = "Ангелина";
        String person10 = "Лиза";
        String person11 = "Алина";
        String person12 = "Евгений";
        String person13 = "Олег";
        String person14 = "Ильдар";

        supermarket.addPerson(person1);
        supermarket.addPerson(person2);
        supermarket.addPerson(person3);
        supermarket.addPerson(person4);
        supermarket.addPerson(person5);
        supermarket.addPerson(person6);
        supermarket.addPerson(person7);
        supermarket.addPerson(person8);
        supermarket.addPerson(person9);
        supermarket.addPerson(person10);
        supermarket.addPerson(person11);
        supermarket.addPerson(person12);
        supermarket.addPerson(person13);
        supermarket.addPerson(person14);

        supermarket.size();
        supermarket.deletePerson();
        supermarket.size();

    }
}
