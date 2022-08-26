import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public static int maxNumberWords;

    public PersonComparator(int maxNumberWords) {
        this.maxNumberWords = maxNumberWords;
    }

    @Override
    //TODO без использования maxNumberWords:
//    public int compare(Person o1, Person o2) {
//        if (o1.numberWords() < o2.numberWords()) {
//            return 1;
//        } else if (o1.numberWords() > o2.numberWords()) {
//            return -1;
//        } else return Integer.compare(o2.getAge(), o1.getAge());
//    }
    //TODO с использованием maxNumberWords:
    public int compare(Person o1, Person o2) {
        if (o1.numberWords() <= maxNumberWords && o2.numberWords() <= maxNumberWords) {
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
    }
}
