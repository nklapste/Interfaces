// Junit4 imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

// imports needed (intelliJ IDEA helps)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Assignment 5: Interfaces <br />
 * Part 1: The {@code CoffeeTest} class
 *
 * Name: Nathan Klapstein
 * ID: 1449872
 */
public class CoffeeTest {
    private List<Coffee> coffees;

    /**
     * Simple Junit setup that creates a predefined List of coffees
     * to be sorted later in testComparable.
     *
     * Could be randomized for better test coverage.
     */
    @Before
    public void setUp() throws Exception {
        coffees = new ArrayList<Coffee>();
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(2));
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(20));
        coffees.add(new Coffee(5));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testComparable() {
        Collections.sort(coffees);
        // grab the first element of coffee as starting comparision
        int lastStrength = coffees.get(0).getStrength();

        for (Coffee type : coffees) {
            // ensure list of coffee is in proper order
            assertTrue(lastStrength <= type.getStrength());
            lastStrength = type.getStrength();

        }
    }
}
