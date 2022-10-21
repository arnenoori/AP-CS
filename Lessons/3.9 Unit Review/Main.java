class Main {
  public static void main(String[] args) {

    Employee e1 = new Employee("John Zwicker"); 
    System.out.println(e1.getName()); 
    // prints: John Zwicker
    e1.work(41); 
    e1.work(39.4);
    System.out.println(e1.getHoursWorked()); 
    // prints: 80.4
    System.out.println(e1.getIdNum()); 
    // prints 1 

    Employee e2 = new Designer("Tiffany Smart"); 
    e2.work(39.8); 
    e2.work(41.2);
    System.out.println(e2.getHoursWorked()); 
    System.out.println(e2.getIdNum()); 
    System.out.println(((Designer) e2).improveUX()); 


    Producer e3 = new Producer("Yong Woo"); 
    e3.work(40); 
    e3.work(40);
    System.out.println(e3.getHoursWorked()); 
    // prints: 80
    System.out.println(e3.getIdNum());
    // prints 3  
    System.out.println(e3.produce());
    // prints The team has refocused on their task.

// Which of these don't work
// d, g, h

// f, i 

// can only cast if the thing is already a designer

  }

public static void doSomething(Employee emp1, Employee emp2, double x, String name) {
  emp1.work(x); 
  x++; 
  emp2 = new Employee("Jomaro Kindred"); 
  name += " III";
}

// watch out for methods with void 

/*
1. What determines if a method can be called? Where is this determined?
  - The compiler, the Java Virtual Machine

  - Answer: The variable type must cntain the method. Determined by the compiler. 

2. What determines which version of a method (with same signature) is called? Where is this determned?
  - the variable class 

  - Answer: Done by the JVM (dynamic or late binding)

3. When can you reference an object that is a different type from the variable? 

- When the object type is a subclass of the varible type. 

*/

}