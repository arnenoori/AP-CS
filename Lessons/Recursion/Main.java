class Main {
  public static void main(String[] args) {
System.out.println(getSum(5));
/*
Thinkin recursively

What is therecursive formula for each number in the sequence 2,4,6,8,10,12 

= (n-1) + 2

What does this look like in code?

public static int getNthEvenNum(int n) { 
  if(n == 1) { 
    return 2; 
  }
  return getNthEvenNum(n-1) + 2; 
}
-------------------------- 
Thinking recursively 

What is the recursive formula for each number in the fibonacci sequence? 

1,1,2,3,5,8,13,21

a(1) = 1, a(2) = 1, a(n) = a(n-1) + a(n-2)

What does that look like in code?
  
  public static int fibonacci(int n) { 
  if(n == 1 || n == 2) { 
    return 1; 
  }
  return fibonacci(n-1) + fibonacci(n-2); 
}

----------------------------
What is the recursive forula for factorials?

5! = 5 * 4 * 3* 2 * 1

a(0) = 1 
a(n) = n * a(n-1)

4! = 4*3!

**A recursive method has the ability to call itself.**

public void method(int x) { 
 // some way to stop recursive (called a base case) 
 ... 
 method(x-1); // the recursive call 
 ...
}


What is the recursive formula for factorials?

f(0) = 1, f(n) = n * f(n-1)

public static int recursion(int n) { 
  if(n == 0) { 
    return 1; 
  }
  return recursion(n-1) * n; 
}
---------------------

*/


// Write a static recursive method to compute the sum of the first n positive integers
  }

public static int getSum(int n) { 
  if(n == 1) { 
    return 1; 
  }
  return getSum(n-1) + n; 
  /*
  */
}

}