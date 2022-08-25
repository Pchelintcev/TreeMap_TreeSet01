import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> artPeople = new ArrayList<>();

        artPeople.add(new Person("Rembrandt", "Harmenszoon van Rijn", 63));
        artPeople.add(new Person("Leonardo", "di ser Piero da Vinci", 67));
        artPeople.add(new Person("Michelangelo", "di Buonarroti Simoni", 88));
        artPeople.add(new Person("Rogier", "van der Weyden", 64));
        artPeople.add(new Person("Alessandro", "di Vanni Filipepi", 65));
        artPeople.add(new Person("Raffael", "da Urbino Santi", 37));

        System.out.println("Несортированный список:");
        for (Person artPerson : artPeople) {
            System.out.println(artPerson);
        }
        System.out.println();
        System.out.println("Сортировка компоратором:");
        Collections.sort(artPeople, new PersonComparator());
        for (Person artPerson : artPeople) {
            System.out.println(artPerson);
        }
    }
}
