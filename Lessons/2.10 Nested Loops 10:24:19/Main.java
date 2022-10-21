class Main {
  public static void main(String[] args) {


  // print a multipcation table up to 5x5

    for (int i = 1; i < 6; i++) { 
      for (int j = 1; j < 6; j++) {
      // runs loop 9 times (3x3 because of the nested loop)
        System.out.print(i*j + " ");
        if (i*j < 10) { 
          System.out.print(" ");
        } 
      }   
      System.out.println();
    }

    // Print a right triangle with legs of length size
    // if size = 4: 
    // M 
    // MM
    // MMM
    // MMMM

    for (int a = 1; a < 6; a++) { 
      for (int b = 1; b < a; b++) {
        System.out.print("M");
      }
        System.out.println();
    }   

    // print a right justified right triangle with legs of length size 
    // if size = 4: 
    //    ^
    //   ^^
    //  ^^^
    // ^^^^

  //   for (int a = 1; a < 6; a++) { 
  //     for (int spaces = a - b; spaces > 0; b--) {
  //       System.out.print(" ");
  //     }
  //     for (int b = 1; b <= a; b++) {
  //       System.out.print("^");
  //     }
  //       System.out.println();
  //   }  
  // }

}

  // Create a method printAnnoyingPattern1 that takes an int for the size of the pattern and then prints a pattern like this: 
  // parameter of 5 gives
  // ****%
  // ***%*
  // **%**
  // *%***
  // %****

public static void printAnnoyingPattern1(int a, int b) {

    for (int size = 1; size < 6; size++) { 
      for (int pattern = 1; pattern < size; pattern++) {
        System.out.print("*");
      }
        System.out.println();
    }   

}

// Create a method printAnnoyingPattern2 that takes 2 strings that are 1 character in length (for a chalenge, check the input to make sure it is only 1 character and an int for the size. Print a pattern like this: 
// If the user picked @ and # and 4 
// @@@@
// #@@#
// ####
// #@@#
// @@@@
// If the user picked @ and # and 5 
// @@@@@
// #@@@#
// ##@##
// #####
// ##@##
// #@@@#
// @@@@@


} 