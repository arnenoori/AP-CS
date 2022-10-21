class Main {
  public static void main(String[] args) {
    //Determine if someones age is even or odd and if their name starts with a vowel or consonant 

    int age = 38; 
    String name = "Kinney"; 
    String vowels = "aeoiuAEOIU";
    // Testing same code in 2 different ways 

    if (age % 2 == 0) {// equal to 0 means age is even
      if (vowels.contains(name.substring(0,1))) { //checks first letter for if its a vowels
        System.out.println("even and vowel"); 
      } else { // Consonant 
        System.out.println("even and consonant");
      }
    } else { // for anything else, age is odd
      if (vowels.contains(name.substring(0,1))) {
          System.out.println("odd and vowels");

      } else {
        System.out.println("odd and consonant");
      }
    }
    if (age % 2 == 0 && vowels.contains(name.substring(0,1))) {
      System.out.println("even and voewl"); 
    }else if (age %2 == 1 && vowels.contains(name.substring(0,1)) {
      System.out.println("odd and vowel"); 
    } else if (age % 2 == 0 && !vowels.contains(vowels.contains(name.substring(0,1))) {
      System.out.println("even and consonant"); 
    } else {
      System.out.println("odd and consonant"); 
    }

/*
 int x = 20 
 if (x > 10)
*/

//comparing doubles 
double a = 4.35 * 100;
System.out.println(a == 435.0);

// Check if the difference is small enough. 
final double EPSILON = 1E-10;
System.out.println(Math.abs(a - 435.0) < EPSILON);


  }
}