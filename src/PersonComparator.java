// Needed import for interfacing
import java.util.Comparator;

/**
 * Comparator class for Person
 *
 * Name: Nathan Klapstein
 * ID: 1449872
 */
public class PersonComparator implements Comparator<Person> {
    /**
     * The most powerful and thoughtful constructor ever
     * devised by man is noted below
     */
    public PersonComparator() {

    }

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
