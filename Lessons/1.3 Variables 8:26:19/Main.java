class Main {
  public static void main(String[] args) {
    int x = 2;
    double y = 234.12;
    boolean boo = false;
    String course = "APCS";

    System.out.print(x + " ");
    System.out.println(y);
    System.out.println(boo);

    int x2 = x;
    double y2 = y;
    boolean boo2 = boo;
    String course2 = course;

    System.out.println(x2 + " " + y2 + " " + boo2 + " " + course2);

    x = 3;
    y = 3.32;
    boo = true;
    course = "Art History";

    System.out.println(x + x2);
    System.out.println(x % x2);
  }
}

/*
 * Stack vs heap Stack - a heap is shared among everything in the program
 * 
 * modulus returns the remainer //int/int returns an int. BEWARD!
 * 
 * How to get the remainder
 * 
 * This = is not an equal sign, it is an assiggnment operator. The right value
 * is assigned to the left variable.
 * 
 */
