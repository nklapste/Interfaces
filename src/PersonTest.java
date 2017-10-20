// Junit4 imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void runTest() {
        // TODO: Assignment 5 Part 3 -- rewrite this using JUnit

        int lastAge = 0;
        for (Person person : persons) {
            System.out.println(person);
            assert lastAge <= person.getAge();
            lastAge = person.getAge();
        }
    }
}
