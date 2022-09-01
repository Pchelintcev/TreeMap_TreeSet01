import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> artPeople = new ArrayList<>();

        artPeople.add(new Person("Rembrandt", "Harmenszoon Rijn", 63));
        artPeople.add(new Person("Leonardo", "di ser Piero da Vinci", 67));
        artPeople.add(new Person("Michelangelo", "di Buonarroti Simoni", 88));
        artPeople.add(new Person("Rogier", "van der Weyden", 64));
        artPeople.add(new Person("Alessandro", "di Filipepi", 65));
        artPeople.add(new Person("Raffael", "da Urbino Santi", 37));

        System.out.println("Несортированный список:");
        for (Person P : artPeople) {
            System.out.println(P);
        }
        System.out.println();

        //TODO лямбда:
        Comparator <Person> artComp = (o1, o2) ->{
            if (o1.numberWords() <= 3 && o2.numberWords() <= 3) {
                if (o1.numberWords() < o2.numberWords()) {
                    return 1;
                } else if (o1.numberWords() > o2.numberWords()) {
                    return -1;
                } else {
                    return Integer.compare(o2.getAge(), o1.getAge());
                }
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
        for (Person P : artPeople) {
            System.out.println(P);
        }
    }
}
