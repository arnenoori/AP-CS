class Main {
  public static void main(String[] args) {

/*
  What are our primitive data types: 
  int double boolean

  What is an object? 
  if the class is the blueprint, an object is the house 

  An object is a state (block of data) and methods created from the blueprint class 

    - Most commonly used so far is String 
    - Length 
    - Parseint

  3 parts of object storage
    - Object variable holds the object reference (location) which points to the actual data (state) 

Accessor vs mutator methods 
 - mutator methods change (mutate) the object
 - Accessor does not change the method - anything in the string class
 - String class is not mutatable 

Pop Quiz: 
  Rectangle box = new Rectangle(1,2); 
  box.setX(40); 

My answers: 
  Rectangle = object  
  box = operator 
  new = new operator 
  Rectangle = parameters 
  (1,2) = explicit parameters 

Actual answers: 

  Rectangle box = new Rectangle(1,2); 
  box.setX(40); 

  Rectangle = variable type
  box = variable name 
  = = assignment operator 
  new = new operator 
  Rectangle = constructor 
  (1,2) = parameters 
  box.setX(40); = box is implicit parameter and 40 is the explicit parameter

^^ Knowledge dep 1-2

What is the process of writing and runing code? 

Where errors occur 

write it -> compiler turns it into java byte code (Syntax/Compile-Time) -> java virtual machine runs it (Exceptions/Runtime) -> output (Logic)

Syntax/Compile-time Error Examples 
- Missing semi-colon 
- Misspelling method name 
Exception/Runtime Error Examples 
- Dividing by 0 
- Index out of bounds 
Logic Error Examples
- Error not expected 

What can you tell from seeing this?
System.out.println(someMethod(5,"hi")); 
- someMethod = parameters of a method 

System.out is an object variable 
println is a method 
someMethod is a method 
someMethod returns something
someMethod takes n a number and a String as parameters 

What is the difference between printing and returning?

My answer: 
- Return stores it, and if nothing is assigned nothing is printed 
- Printing uses the print method and you can use printing to print a return method 

Kinney Answer:
- Print data for humans to use 
- Return data for another part of your program to use 
   - If the return type is void you don't need to type a return 

Math Practice: 

MATH IS INT! unless otherwise 

1 + 8/3 * 4  -7 % 2 =
8

What's wrong with this?
(int) Math.random() * 6 + 1 = 1


Write method headers for the following scenarios:
1) Write a method that computes the circumference of a circle. 

public static double circleCircumference (2r) {

}

2) Write a method that gives the sum of number of characters in 3 Strings. 

public static intnumberCharacters (String s1, String s2, String s3) {

}

3) Write a method that takes a String with 2 words in it and switches the order of those two words.

public static String switchWords(String words) { 
  
}








*/
  }
}