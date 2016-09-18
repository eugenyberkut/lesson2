package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Person p1 = new Person("Иванов",22);
        Person p2 = new Person("Петров",23);
        Person p3 = new Person("Петров",23);
        System.out.println(p1);
        System.out.println(p2);
        if (p3.equals(p2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        String s1 = "Hello";
        String s2 = "Hello";
        if (s1==s2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        System.out.println("-----------------------");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons);
        System.out.println(persons.contains(p3));
        System.out.println("------------------------");
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        for (Person p : persons) {
            System.out.println(p);
        }
        persons.forEach(System.out::println);

//        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
//            Person person = iterator.next();
//            if (person.getAge()>22) {
//                iterator.remove();
//            }
//        }
        Person[] parr = new Person[2];
        parr = persons.toArray(parr);

        persons.add(new Person("Ивановский",33));
    }
}
