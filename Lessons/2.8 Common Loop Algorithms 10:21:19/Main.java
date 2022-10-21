import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    // write the algrithm from last week to find the sum of nymbers entered by the user 

/*
  int sum = 0;
  System.out.println("Please enter numbers and enter any other key when done."); 
  while (in.hasNextInt()) {
    sum += in.nextInt();
  }
  in.next();
  System.out.println("total sum of #s = " + sum); 
*/ 



// write a loop to find the min and max values entered a user

/*
  SUDO CODE: 
  // find number smallest in the range - assign to a variable 
  // find number largest number
  // if statement to compare?


*/

/*
  System.out.println("Please enter numbers and enter any other key when done."); 
  int max = Integer.MIN_VALUE; 
  int min = Integer.MAX_VALUE; 
  while (in.hasNextInt()) {
    int input = in.nextInt(); 
    if (max < input) {
        max = input; 
    }
    if (min > input) {
      min = input;
    }
  }
  in.next(); 
  System.out.println("Min = " + min + " & Max = " + max);

*/

  System.out.println(sumDigit(232323));
  }


  // write a method to find the sum of the digits in any number. 
  // Examples: sumDigit(1234) returns 10
  // sumDigit(931245) returns 22

public static int sumDigit(int num) { 
      int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
  return sum; 
} 





}