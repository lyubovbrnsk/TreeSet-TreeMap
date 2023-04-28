import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Анна-Мария", "Васькина", 17));
        personList.add(new Person("Ахмад-Фархад", "Тюлькин", 40));
        personList.add(new Person("Александр", "Пупков", 57));
        personList.add(new Person("Ева-Мария", "Клюкина", 19));
        personList.add(new Person("Иван", "Васюков", 25));
        PersonCompare p = new PersonCompare(2);
        Collections.sort(personList, new PersonCompare(2));
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}