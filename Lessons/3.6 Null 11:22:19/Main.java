class Main {
  public static void main(String[] args) {
    // Null is a value to signifiy that an object variale is not pointing at any objects. 

  String blah = null; // Null is a key word 

  if (Math.random() < 0.5) { 
    blah = "Winner!"; 
  }

  System.out.println(blah); 

  String returned = doNothing(); 
  // In case anobject variable MIGHT be holding null, check before you call a method to avoid null pointer exceptions. 
  if (returned != null) { 
  returned = returned.toLowerCase(); 
} 


  }

public static String doNothing() { 
  String returnMe = null;

  // Search for a particular String, if it is found, return it. 

  return returnMe;

}

}