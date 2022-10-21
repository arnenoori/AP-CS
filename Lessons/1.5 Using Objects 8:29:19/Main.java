import java.awt.Rectangle;

class Main {
  public static void main(String[] args) {
    String word1 = "chocolate";
// This is unique to Strings, other objects can't be made like this. Normal objects are made like this: 
    String word2 = new String("Anarchy");
// "New" is called the new operator - it sets aside space in the heap for the object. The second String is called the constructor - it initializes the values made by the new operator.
// Anthing in "" (quotes) is alled a String literal.

  word2 = word1;
  System.out.println(word2);
  word1 = word1.substring(3);
  // Indices count from 0. Index 3 i chocolate is the second c
  System.out.println(word2 + " " + word2);

  Rectangle box1 = new Rectangle(50, 100, 10, 20);
  Rectangle box2 = box1;
  box1.setSize(20, 10);
  System.out.println("box1: " + box1 + "\nbox2: " + box2);
// Start here... 

  Rectangle rec1 = new Rectangle(30, 25, 47, 52);
  Rectangle rec2 = rec1; 
  box1.setSize(4, 2);
  System.out.println("box1: " + rec1 + "\nbox2: " + rec2);

  }
}