class Main {
  public static void main(String[] args) {

// write a method called printXs that will print the given number of Xs on a line. 
 printXs(5); 

  // write a method to find and return the number of occurrences of a digit in a number 
  int gNO1 = getNumOccurrences(123445,4); //would return 2. 
  int gNO2 = getNumOccurences(27652313, 2); // would return 3. 
  System.out.println(gNO1 + "\n" + gNO2); 


  // write a method a find and return and number of occurrences of a character in a String. 
  int gNO3 = getNumOccurrences("Hello world", "1"); // would return 3
  System.out.println(gNO3); 

  }

// ---------------------------------------------
// ---------------------------------------------
// ---------------------------------------------
  // LOOP #1 -
  //Write a method called printXs that will print the given number of Xs on a line. 

  public static void printXs(int repetition) {
    for (int i = 0; i < repetition; i++) {
      System.out.print("x");
    }
    System.out.println();
  }

  // LOOP #2 -
  // Write a method to find and return the number of occurrences of a digit in a number 


  public static int getNumOccurrences(int number, in find) {
    // Handle negatives
    number = Math.abs(number);
    // Handle 0 (but also does al single digit numbers)
    if (number == find)
      return 1; // return methods exit the method
    int count = 0;
    while (number > 0) {
      if (find == number % 10)
        count++;
      number /= 10;
    }
    return count;
  }

  // LOOP #3 -


}