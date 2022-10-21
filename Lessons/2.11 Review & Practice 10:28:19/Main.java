class Main {
  public static void main(String[] args) {

// Warmup: 
// Write a method with a loop that will take any number and print it out 1 digit per line starting with the ones digit 

// SUDO CODE: 
// 1. take into substring 
// 2. then /n (breaks the line)


printOneDigitAtATimeBackwards(11899);

// Write a method to print the first n Fibonacci numbers. 
printFibis(7); 
// print: 1 1 2 3 5 8 13


// Write a method to reverse the digits of a number. 
// would return 1234
System.out.println(reverseDigits(1234)); 

  }


public static int reverseDigits(int num) { 
  int newNum = 0; 
  while (num > 0) {
    int digit = num % 10; 
    num /= 10; 
    newNum *= 10; 
    newNum += digit; 
  }
  return newNum; 
}

public static void printFibis(int num) { 

  int prevNum = 0; 
  int currNum = 1; 
  for (int i = 0; i < num; i++) { 
    System.out.println(currNum + " "); 
    currNum += prevNum;
    prevNum = currNum - prevNum; 
  }
  System.out.println(); 


}



public static void printOneDigitAtATimeBackwards(int num) {
  while(true) { 
    System.out.println(num % 10); 
    num /= 10; 
    if (num == 0) { 
      return; 
    }
  }
}


public static void printAnnoyingPattern1(int size) {
  for (int row = 0; row < size; row++) { 
    for (int col = 0; col < size; col++) { 
      if (row == size - col -1) { 
        System.out.print("%"); 
      } else { 
        System.out.print("*"); 
      }
    }
    System.out.println(); 
  }

}

}