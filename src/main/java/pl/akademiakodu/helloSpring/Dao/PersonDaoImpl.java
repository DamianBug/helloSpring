package pl.akademiakodu.helloSpring.Dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 31.07.2017.
 */
public class PersonDaoImpl implements PersonDao {

    private static List<Person> people = new ArrayList<>();

    static{
        people.add(new Person(11,"Jan", "Kowalski"));
        people.add(new Person(21,"Piotr", "Nowak"));
        people.add(new Person(23,"Zdzisław", "Python"));
        people.add(new Person(50,"Józef", "Nowak"));
    }

    @Override
    public List<Person> findLastName(String lastName){
        List<Person> results = new ArrayList<>();
        for (Person person: people){
            if (person.getLastName().equals(lastName))
                results.add(person);
        }
        return results;
    }
    public List<Person> findAll(){
        return people;
    }

    @Override
    public Person findOne(long id) {
        Person result = null;
        for (Person person : people) {
            if (person.getId() == id){
                result = person;
        }
    }
    return result;
}
}