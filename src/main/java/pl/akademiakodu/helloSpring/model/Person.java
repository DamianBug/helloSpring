package pl.akademiakodu.helloSpring.model;

/**
 * Created by Damian on 28.07.2017.
 */
public class Person {

    private long id;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    private String firstName;
    private String lastName;

    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName();
    }
}
