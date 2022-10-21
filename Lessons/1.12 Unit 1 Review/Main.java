class Main {
  public static void main(String[] args) {
    int x; 
    // Declared but not initialized 
         // System.out.println(x); 
    // Compile/Syntax Error - Variables must be initialized before being used. 
        // System.out.println(0/0);     
   // Runtime Errors 
    // Example: 
        // Substring outside 
        // Unintialized variable 
   int z = 1+2;
   System.out.println(z + " = 3");
   // Logic Error 
      // Don't get the outcome you want 


// ++ -- 
int w = 5; 
System.out.println(w-- * w); 
// What this does 5 * 4 (uses the 5 and then turns the next value into a 4 because both of them are the same variable - so w-- * 2 would be 3 * 2)
System.out.println(w); // prints 4 
w = 5; 
System.out.println(w * w--); // prints 25 
System.out.println(w); // prints 4 

// Tracing Practice
x = 5; 
int y = -4; 
System.out.println("x: " + x + " y: " + y); 
System.out.println(x-- + y--); 
// Carries over 
System.out.println("x: " + x + " y: " + y); 
x = y-- + x--; 
// Changes X value 
System.out.println("x: " + x + " y: " + y);
y = x-- * x++ ; 
// X retains the same value 
System.out.println("x: " + x + " y: " + y);

// Generate random int between 33 and 89 
int test = (int) (Math.random() * 57) + 33;
System.out.println(test); 

// Write a method to take 2 words and turn them into a camelCased String 
// ******* VERY SIMILAR TO THE FREE-RESPONSE ON THE TEST *******
System.out.println(camelCase("HELLO","wORLd")); 
// helloWorld
  }
  public static String camelCase(String s1, String s2) {
    s1 = s1.toLowerCase(); 
    s2 = s2.toLowerCase(); 
    String s2FirstLetter = s2.substring(0,1); 
    s2FirstLetter = s2FirstLetter.toUpperCase(); 
    s2 = s2.substring(1); 
    return s1 + s2FirstLetter + s2; 
  }

  // write a method to generate random ints given a low and high int. 
  // scanning & printing should happen in main


      /* 
    - Everything on the quiz 
      - Likes using the most commonly missed topics on the quiz
    - Free Response where method header is written
    - Some vocab terms 
    - Generate random number between A & B Range 
    
    */

int x = 7; 
System.out.println(x++); 
System.out.println(x++); 
System.out.println(x++); 
}
