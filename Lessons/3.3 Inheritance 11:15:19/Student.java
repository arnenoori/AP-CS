
public class Student extends Person { 
  private String classW; 
  // We don't need to handle the names as that is still handled by the person class

  public Student(String firstName, String lastName, String job) { 
    // You call the super constructor FIRST!! In your subclass constructors. 
    super(firstName, lastName); 
    this.classW = classW; 
  } 

  // You can override methods in the superclass: 
  public String toString() { 

    return super.toString() + " is a " + this.classW; 
  }

}