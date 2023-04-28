import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Анна-Мария", "Васькина", 17));
        personList.add(new Person("Ахмад-Фархад", "Тюлькин", 40));
        personList.add(new Person("Александр", "Пупков", 57));
        personList.add(new Person("Ева-Мария", "Клюкина", 19));
        personList.add(new Person("Иван", "Васюков", 25));

        Collections.sort(personList, (o1, o2) -> {
            int lenght1 = o1.getName().split("-").length;
            int lenght2 = o2.getName().split("-").length;
            if (lenght1 > lenght2 && (lenght1 >= 2 && lenght2 >= 2)) {
                return 1;
            }

            if (lenght1 < lenght2) {
                return -1;
            }
            return o1.getAge() - o2.getAge();
        });


        for (Person person : personList) {
            System.out.println(person);
        }
    }
//
//    private final int macCol;
//
//    public PersonCompare(int maxCol) {
//        this.macCol = maxCol;
//    }
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        if ((wordSurname(o1) > wordSurname(o2) && (wordSurname(o1) >= macCol && wordSurname(o2) >= macCol))) {
//            return 1;
//        }
//
//        if (wordSurname(o1) < wordSurname(o2)) {
//            return -1;
//        }
//        return o1.getAge() - o2.getAge();
//    }
//
//    public int wordSurname(Person person) {
//        String name = person.getName();
//        String lenght = String.valueOf(name.split("-").length);
//        return Integer.parseInt(lenght);
//    }
}