// Junit imports
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


// imports needed (intelliJ IDEA helps)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Assignment 5: Interfaces <br />
 * Part 1: The {@code CoffeeTest} class
 */
public class CoffeeTest {
    private List<Coffee> coffees;

    @Before public void setUp() throws Exception {
        coffees = new ArrayList<Coffee>();
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(2));
        coffees.add(new Coffee(10));
        coffees.add(new Coffee(20));
        coffees.add(new Coffee(5));
    }

    @After public void tearDown() throws Exception {
    }

    @Test public void testComparable() {
        // TODO: Assignment 5 Part 1 -- rewrite this using JUnit
        Collections.sort(coffees);

        int lastStrength = coffees.get(0).getStrength();

        System.out.println("Coffees in order of strength:");
        for (Coffee type : coffees) {
            System.out.println(type);
            assert lastStrength <= type.getStrength();
            lastStrength = type.getStrength();

        }
    }
}
