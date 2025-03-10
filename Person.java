package Clinic;

// Abstract class representing a person
public abstract class Person {
 protected String firstName;
 protected String lastName;
 protected String address;

 // Constructor for initializing person's details
 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 // Abstract methods to be implemented by subclasses
 public abstract void displayInformation();
 public abstract void visit(String doctorName);
}
