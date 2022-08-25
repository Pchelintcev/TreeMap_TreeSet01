import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.numberWords() < o2.numberWords()) {
            return 1;
        } else if (o1.numberWords() > o2.numberWords()) {
            return -1;
        } else return Integer.compare(o1.getAge(), o2.getAge());
    }
}
