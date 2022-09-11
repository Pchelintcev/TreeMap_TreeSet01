import java.util.ArrayList;
import java.util.Collections;
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
        artPeople.add(new Person("Abremo", "Marco van Basten fon Svishen", 16));
        artPeople.add(new Person("Ronald", "Craman van der Sar", 17));
        artPeople.add(new Person("Elena", "Craman van der Sar", 18));

        System.out.println("Несортированный список:");
        for (Person P : artPeople) {
            System.out.println(P);
        }
        System.out.println();

        System.out.println("Сортировка предикатом:");
        Predicate<Person> predicate = person -> person.getAge() < 18; //параметры пишутся с маленькой буквы
        artPeople.removeIf(predicate);
        for (Person P : artPeople) {
            System.out.println(P);
        }
        System.out.println("конец.");
    }
}
