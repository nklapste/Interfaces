


public class Person implements Comparable<Person>{
    private int age;

    public Person(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
