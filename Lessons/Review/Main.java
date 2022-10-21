class Main {
  public static void main(String[] args) {

// What are the parts of a for loop header?
// for (create; condition; change)

// Does a far loop need all 3 parts of its header? If not, which parts can it live without and how do you write them?
// Create can be skipped if variable is already defined. Change can be skipped. Condition can technically be skipped so technically all that is needed in a for statement is (;;)

// What are the parts of a while loop header
// condition 

/* Rewrite the for loop as a while loop
for (int i = 0; i < 10; i++) { 
  System.out.println(i);
}

int i = 0; 
if (i < 10) { 
  System.out.println(i++);
}

// What is the difference between the two?
// i retains the value afterwards because the value of I is declared before hand. 



*/

// int i = 0; 
// while (i > 0) {
//   System.out.println(i);
//   i--;
// }

int i = 1; 
while (i > 0) { 
  System.out.println(i);
  i++;
}

// for 
// while  
// while 
// for

// Write a method that starts at a requested letter of the alphabet and prints out the letter (lower case) backward until it reaches a. 


  }

  public static String alphabetBackwards(String alphabet) {
  String alphabet2 = "abcdefghijklmnopqrstuvwxyz"; 
  alphabet = char.toLowerCase(); 
  for (int i = alphabet2.indexOf(char) - 1; i > -1; i--) { 
    System.out.println(alphabet2.substring(i, i+1)); 
  }

  }

}