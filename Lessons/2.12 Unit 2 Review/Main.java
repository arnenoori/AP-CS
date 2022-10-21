class Main {
  public static void main(String[] args) {
/*
For what values of x will these be true?

1) x != 20 || x >= 0 && x < 30 && x % 5 == 0 

all real numbers 

2) x/5 == 0 && x/0 == 3 

nothing 

3) x > Integer.MIN_VALUE || x/0 == 1

x > Integer.MIN_VALUE

----------- 
*/

// boolean test = 10; 

// Write a boolean expression for when x is (between 8 and 20 inclusive) or (x is both smaller than negative 10 and odd) or (x is larger than 100 and even)

// (8 <= x && x <= 20 || x < -10 && x%2 != 0 || x > 100 && x%2 == 0)


// Write code to see if there is a character stored in a string in the 5th spot in another string called word and then cut out that character. 

/*
  if integrity and g it would be integrity 
  if integrity and h it would be integrity 

// check if letter exists in the string and the remove 5th letter through substring 


if (word.length() > 4 && word.substring(4,5).equals(letter)) { 
  System.out.println(word.substring(0,4) + word.substring(5);
}

---------------------
*/
String word = "cat";
System.out.println(reverse(word));
  }

// Write a method that takes a string and reverses the order of its characters. 
// reverse("cat") returns "tac"

public static String reverse(String word) {
  String drow = ""; 
  for (int i = 0; i < word.length(); i++) { 
    drow = word.substring(i, i+1) + drow; 
  }
  return drow;
}

} 

