package appl;

/**
 * Created by Andrii_Banul on 1/25/2017.
 */

//import javax.persistence.*;

//@Entity
public class Employee {

    //private @Id @GeneratedValue Long id;
    private String firstName, lastName, description;

    private Employee() {}

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}