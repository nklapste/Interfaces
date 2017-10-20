/**
 * Person Class
 *
 * Name: Nathan Klapstein
 * ID: 1449872
 */
public class Person implements Comparable<Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, p.getAge());
    }

}
