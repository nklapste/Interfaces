/**
 * Assignment 5: Interfaces <br />
 * Part 1: The {@code Coffee} class
 *
 * Name: Nathan Klapstein
 * ID: 1449872
 */
public class Coffee implements Comparable<Coffee> {
    // TODO: Assignment 5 Part 1 -- complete this class
    private int strength;       // The strength of the coffee

    public Coffee(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public int compareTo(final Coffee c) {
        return Integer.compare(this.strength, c.getStrength());

    }
}
