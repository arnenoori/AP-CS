class Main {
  public static void main(String[] args) {
    Person p1 = new Person("John","Doe");
		System.out.println(p1);
		System.out.println(p1.getLastFirst());
    // System.out.println(p1.getLastFast()); 

    Staff s1 = new Staff("Valerie", "Thompson", "Science teacher"); 
    System.out.println(s1);
		System.out.println(s1.getLastFirst());
    System.out.println(s1.goToMeeting()); 

    Student u1 = new Student("Adi", "Anger", "junior"); 
    System.out.println(u1); 
    System.out.println(u1.getLastFirst()); 

    // Polymorphism 
    // You can reference object from a superclass variable.
    Person p2 = new Staff("Nora", "Seager", "Social Science Teacher"); 
    // Even though p2 is from the Person class, the toString method from the Staff class is used as p2 is pointing at a Staff object. 
    System.out.println(p2); 
    System.out.println(p2.getLastFirst()); 
   // System.out.println(p2.goToMeeting()); 

// We can cast to get around this. Check first to see if yo can actually do the cast to avoid a run time error. 
if (p2.getClass().equals(Staff.class)) { 
  Staff s2 = (Staff) p2; 
  System.out.println(s2.goToMeeting());
  
  // or an alternate way to cast 

  System.out.println( ( (Staff) p2).goToMeeting() );  
} 

  // Staff s3 = (Staff) p1; 
  // Student cannot be coverted to Staff

  }
}