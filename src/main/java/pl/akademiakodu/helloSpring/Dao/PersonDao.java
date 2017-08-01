package pl.akademiakodu.helloSpring.Dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.List;

/**
 * Created by Damian on 31.07.2017.
 */
public interface PersonDao {

    List<Person> findLastName(String lastName);
    List<Person> findAll();
    Person findOne(long id);
}
