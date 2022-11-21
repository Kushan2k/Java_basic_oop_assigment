package Utils.Classes;

// importing relavent classes 

import Utils.Interfaces.IPerson;


// Person class declearation 
public abstract class Person implements IPerson {

  protected String firstName, lastName;
  protected int age;
  protected char gender;

  // parameterized constructor 
  public Person(String afirstName, String alastName, int aage,char g) {
    this.firstName = afirstName;
    this.lastName = alastName;
    this.setAge(aage);
    this.setGender(g);
  }

  public Person(String afirstName, String alastName) {
    this.firstName = afirstName;
    this.lastName = alastName;
  }

  // getters and setters 
  public String getFirstName() {
    return firstName;
  }

  public void setGender(char g) {
    if (Character.toUpperCase(g) == 'F' || Character.toUpperCase(g) == 'M') {
      this.gender = g;
    } else {
      this.gender = '.';
    }
  }

  //setters and getters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 0 && age <= 100) {
      this.age = age;
    } else {
      System.out.println("not a valid age");
    }
  }



  //overriding superclass methods
  @Override
  public void GetDetails() {

    String res = String.format("First Name:- %s\nLast Name:- %s\nAge:- %s", this.getFirstName(), this.getLastName(),
        this.getAge());
    System.out.println(res);

  }
  
  @Override
  public boolean isAdult() {

    if (this.age >= 18) {
      return true;
    } else {
      return false;
    }
  }
  
  @Override
  public String toString() {
    
    return String.format("%s %s", this.getFirstName(),this.getLastName());
  }

  
  
}
