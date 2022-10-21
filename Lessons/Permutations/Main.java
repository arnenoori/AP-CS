import java.util.*;

class Main {
  public static void main(String[] args) {
    // permutation - arrangements of stuff 
    /* loop through to pick a char to go first */
    // take the rest & getPermutations
    //             (list)
    String str = "run"; 
    List<String> permutations = getPermutations(str); 
    System.out.println(permutations); 
  }

  public static List<String> getPermutations(String str) { 
    List<String> perms = new ArrayList<String>(); 

    // first do base case: 
    if (str.length() < 2) { 
      perms.add(str); // add the 1 thing to the list 
      return perms; 
    }
    // loop and pick a char to go first: 
    for (int i = 0; i < str.length(); i++) { 
      String firstChar = str.substring(i, i+1); 
      // get permutations of the rest: 
      String theRest = str.substring(0, i) + str.substring(i+1); 
      List<String> permsOfTheRest = getPermutations(theRest); 
      // add. firstChar to the front of everything in permsOfTheRest
      for (String permFromRest : permsOfTheRest) { 
          perms.add(firstChar + permFromRest);
      }
    }
    return perms;
  }

}