package main;

import java.util.Objects;

/**
 * Created by Eugeny on 18.09.2016.
 */
public class Person {
    private String fio;
    private int age;

    public Person(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person('" + fio + '\'' + ", " + age + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(fio, person.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, age);
    }
}
