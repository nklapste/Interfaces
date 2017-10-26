// Junit4 imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

// imports needed (intelliJ IDEA helps)
import java.util.Set;
import java.util.TreeSet;


/**
 * Assignment 5: Interfaces <br />
 * Part 3: The {@code PersonTest} class
 *
 * Name: Nathan Klapstein
 * ID: 1449872
 */
public class PersonTest {
    private Set<Person> persons;

    /**
     * Simple Junit setup that creates a predefined TreeSet of persons
     * to be sorted (in setUp) and validated (in runTest).
     *
     * Could be randomized for better test coverage.
     */
    @Before
    public void setUp() throws Exception {
        persons = new TreeSet<Person>(new PersonComparator());
        persons.add(new Person(32));
        persons.add(new Person(17));
        persons.add(new Person(13));
        persons.add(new Person(35));
        persons.add(new Person(27));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestOrder() {
        // lastAge is set to 0 as this is the determined min age (logically)
        // (if we randomized test set this would have to rethought)
        int lastAge = 0;
        for (Person person : persons) {
            System.out.println(person);
            // ensure person tree is in proper order
            assertTrue(lastAge <= person.getAge());
            lastAge = person.getAge();
        }
    }
}
