package ru.futsey.springcourse.person.dao;

import org.springframework.stereotype.Component;
import ru.futsey.springcourse.person.models.Person;

import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    public PersonDAO(List<Person> people) {
        people.add(new Person(++PEOPLE_COUNT, "Oleg"));
        people.add(new Person(++PEOPLE_COUNT, "Andrew"));
        people.add(new Person(++PEOPLE_COUNT, "Anton"));
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Jerry"));
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person getPersonById(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }
}
