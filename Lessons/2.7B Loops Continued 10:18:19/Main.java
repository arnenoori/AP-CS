class Main {
  public static void main(String[] args) {
  // Infinite Loop 


  /*
    for (;;) { 
      System.out.println("hi");
    }
*/



// You can technically ski the 3 Cs in for loops, just the ;s are required. 
// It is stylistically OK to skip 1 part of the header (usually the creation or change)
// If you skip both, just use a while loop 

/*

Pseudocode - take a string and create a new String with 2 of each character

  Hi -> HHii 
  Kia -> KKiiaa


1. Calculate number of characters
2. Substring each letter and double the number of each word
3. Print 

KINNEY Answer: 

Take a string and create a new String with 2 of each character 

Create answer = ""
Loop from 0 <= length()
sub.string() then double it

*/


// **IMPORTANT Concept

/*
  String word = "Jean-Luc"; 
  String answer = ""; 
  for (int i = 0; i < word.length(); i++) { 
    answer = answer + word.substring(i, i+1) + word.substring(i, i+1); 
  }
  System.out.println(answer); 
*/

// Take a String, print each letter on its own line.

  String word1 = "Kevin"; 
  String answer1 = ""; 
  for (int i = 0; i < word1.length(); i++) { 
    answer1 = word1.substring(i, i+1);  
    System.out.println(answer1); 
  }


// Take a String, print each letter on its own line backwards. 


  for (int i = word1.length() - 1; i > -1; i--) {  
    System.out.println(word1.substring(i, i+1)); 
  }


  }
}