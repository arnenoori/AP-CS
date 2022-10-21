class Main {
  public static void main(String[] args) {

    // if sound is on, then pla msuic, Otherwise don't.
    // if soundIsOn play music, else don't.
    boolean soundIsOn = false;
    if (soundIsOn) {
      // use curly braces - signify that this is a block
      System.out.println("Musical Noises");
    } else {
      System.out.println("don't don't don't");
    }
    // == checks eqaulity, ! = cheks inequality, <, >, <=, >=
    int age = 17;
    if (age % 2 == 1) {
      System.out.println("Your age is an odd number");
    } else {
      System.out.println("Your age is an even number");
    }

    // Test for equality in objects using the equals method. == checks if object
    // variables are poitning at the same object rather than equal objects.
    // Examples
    System.out.println("Hello".equals("Hello"));

    // To test for ordering of Strings, we will use the compareTo() method
    System.out.println("abc".compareTo("z"));
    // compareTo retuns a neative value if the implicit parameter (before the
    // method) comes first lexicographically, a positive value if the explicit
    // parameter comes first, or a 0 if they are equal.

    // Comparing booleans:
    System.out.println(true == true);
    System.out.println(true != false);
    // can check if both booleans are true:
    System.out.println("t&&t: " + (true && true));
    System.out.println("t&&f: " + (true && false));
    System.out.println("f&&t: " + (false && true));
    System.out.println("f&&f: " + (false && false));

    // Can check if at least one of the booleans are true
    System.out.println("t||t: " + (true || true));
    System.out.println("t||f: " + (true || false));
    System.out.println("f||t: " + (false || true));
    System.out.println("f||f: " + (false || false));

    // PREDICTION Practice
    // && has precendence over || (&& happens first) 
    // T || F && T || T
    System.out.println(true || false && true || true); 
    // F || T && T || F
    System.out.println(false || true && true || false); 
    // T && F || T
    System.out.println(true && false || true);


    // ! means "not"
    // De Morgan's Laws 
    // !(T || F) -> !T !|| !F -> F && T
    // !(F && T) -> T || F

    // ASCII Table order 1. Space 2. Numbers 3. Uppercase 4. Lowercase 
  }
} 