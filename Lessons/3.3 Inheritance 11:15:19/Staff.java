// The extends keyword allows Staff to inherit all of the public stuff from the parent class Person.

public class Staff extends Person { 
  private String job; 
  // We don't need to handle the names as that is still handled by the person class

  public Staff(String firstName, String lastName, String job) { 
    // You call the super constructor FIRST!! In your subclass constructors. 
    super(firstName, lastName); 
    this.job = job; 
  } 

  public String goToMeeting(){ 
    return "I have to go to another #&#@# meeting.";
  }

  // You can override methods in the superclass: 
  public String toString() { 
    // however this won't work because firstName and lastName are privare 
   // return this.firstName + " " + this.lastName + " is a " + this.job; 

    // you can access sper class methods using the super keyword 
    return super.toString() + " is a " + this.job; 
  }

}