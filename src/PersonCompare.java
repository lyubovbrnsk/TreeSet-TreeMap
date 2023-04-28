import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {
    private final int macCol;

    public PersonCompare(int maxCol) {
        this.macCol = maxCol;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if ((wordSurname(o1) > wordSurname(o2) && (wordSurname(o1) >= macCol && wordSurname(o2) >= macCol))) {
            return 1;
        }

        if (wordSurname(o1) < wordSurname(o2)) {
            return -1;
        }
        return o1.getAge() - o2.getAge();
    }

    public int wordSurname(Person person) {
        String name = person.getName();
        String lenght = String.valueOf(name.split("-").length);
        return Integer.parseInt(lenght);
    }
}
