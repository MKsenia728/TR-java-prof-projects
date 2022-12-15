package MyCollections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("\nName: %-15s age: %-4s", name, age);
    }

    @Override
    public int compareTo(Person o) {
        int res = this.age - o.age;
        if (res == 0) res = this.name.compareTo(o.name);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
