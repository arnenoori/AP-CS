class Main {
  public static void main(String[] args) {


/* 
 boolean - a true or false statement 
 conditional statement
  - conditional statement, dependent on the condition 
  i.e. if (condition) then ____ ((Optional) else _____)

How do you compare: 

ints? all of the comparsion objects mainly = sign so 
==, <, <=, >=, >, !=  

double? = | values subtracted | < 0.00000001 - check for equality
  !(Math.abs(difference) < 0.0000001) - check for inequality  
  <, > 

  x < y || Math.abs(x-y) < 0.000001 - <= 

  less than or equal to 

objects? a.equals(b); method
- a.equals(b) - checks if the objects are ueivalent 
a == b - checks if the variables point at the exact same object 

String order: 
c.compareTo(d)

----------------------------- 

Write a method to determine if the areas of two circles are equal. 

INCORRECT:

public static boolean areaVerification(boolean r1, boolean r2) { 
double area1(4.5, 6.5) = Math.PI(r1);
double area2(5.5, 5.5) = Math.PI(r2);

return equalAreas(area1.compareTo(area2));

}

KINNEY ANSWER: 

public static boolena equalAreas(double a, double b) { 
  if (Math.abs(a-b) < 0.0000000001) {
    return true;

  } else {
    return false;
  }
}

----------------------------- 

What is the difference between these two boolean expressions? 

10/n > 2 && n > 0

valuates the second expression only if the first expression is true

vs

n > 0 && 10/n > 2

-----------------------------

De Morgan's law practice 

simplify: 
!(a > b || a == c && b <= c)

AHHHH end gets resolved before the or is resolved 

a <= b && (a != c || b > c)

Inversions: 
> (greater than) goes to <= (not greater than) 

|| goes to &7

----------------------------- 

Write a method to decide if a word states with a capital letter.
startsWithCap("Hello") returns true 
startsWithCap("hello") returns false

MY ANSWER: 
public static boolean startCapitalization(String a) { 
  if (a.substring(0,1)) {
    return true;

  } else {
    return false;
  }
}

KINNEY ANSWER: 

public static boolean startsWithCap(String word) { 
  if (a.substring(0,1).toUpperCase()) {
    return true;
  } else { 
    return false
  }
}

ALTERNATE Short Kinney Answer: 

public static boolean startsWithCap(String word) {
  return word.substring(0,1).compareTo("Z") <= 0; 
}

BIG BRAIN SOLUTIO: 

public static boolea startsWithCap(String word) {
  String caps = "QWERTYUIOPASFGHJKLZXCVBNM"; 
  return caps.contain(word.substring(0,1));
} 

*/


  }
}