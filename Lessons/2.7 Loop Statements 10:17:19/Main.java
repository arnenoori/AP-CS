import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  // loops are if statements that repeat. 
  
  // type 1 loops repeat until a specific condition is met (can't predict the number of repeats)

  // type 2 loops repeat a set number of times

  // user enters numbers until they enter something else and then we display the sum. 

  // type 1 

/*
  Scanner in = new Scanner(System.in); 
  int sum = 0;
  System.out.println("Please enter numbers and enter anyting else when done."); 
  while (in.hasNextInt()) {
    sum += in.nextInt();

  }
  in.next(); // clears out whatever was typed to end the loop 
  System.out.println("sum = " + sum); 

  // Count up to 10

  int counter = 1; 
  while (counter < 11) {
    System.out.println(counter++); 

    // 3 steps - Creation, Check & Change of counter variables into a for loop: 
    for (int count = 1; count < 11; count++) {
      System.out.println(count);
    }
  }



  Scanner average = new Scanner(System.average); 
  int average1 = 0;
  double x = 0;
  System.out.println("Please enter numbers and enter anyting else when done."); 
  while (in.hasNextInt()) {
    average1 += in.nextInt();
    x++; 
    
    // shortcut / # of numbers (how do you find the number of numbers)

  }
  in.next(); // clears out whatever was typed to end the loop 
  System.out.println("sum = " + sum); 
  System.out.println("average of sum = " + average1/(double)x + "."); 



// write a loop to do factorials 
// 5! = 5 * 4 * 3 * 2 * 1 
  int factorial = 12;
  answer = 1; 
  for (int i = 1; i <= factorial; i++) { 
     answer *= i; 
  }

  System.out.println(factorial + "! = " + answer); 
*/ 

// LOOP PRACTICE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11

// start at 40 and count down by 5s (including 0)
/*
  int counter = 40; 
  while (counter < 41) {
    System.out.println(counter-=5); 

    for (int count = 1; count > 0; count-=5) {
      System.out.println(count);

  
  */ 
 int x = 40;      
        while ( x >= 0) 
        { 
            System.out.println(x); 
  
            // Increment the value of x for 
            // next iteration 
            x-= 5; 

    }

// write a lop that rolls dice until a 5 is rolled

System.out.println("Rolling until a 5 is rolled"); 
int roll = 0;
while(roll != 5) { 
  roll = (int) (Math.random() * 6 +1); 
  System.out.println(roll);
}

// write a loop to count the digits in a number (because you can't turn it into a String and use the length() method!!!)

int num = 502135; 
int digits = 1;
while (num > 9) {
  digits++; 
  num /= 10;
}
System.out.println(digits + " digits"); 


  }
}