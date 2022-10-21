class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] kensNums = new int[10]; 
    fillWithRandoms(kensNums, -100, 100); 

    // for-each loop (also known as an enhanced for loop)
    for(int num: kensNums) { 
      // read: for each int called num in kensNums
      // so what does this do, this will copy each item 1 at a time and call it num.
      // Because it is a copy, you cannot change the vales in the array. 

      System.out.print(num + " "); 
    }
    System.out.println(); 

  }

public static void fillWithRandoms(int low, int high){
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * (high - low + 1) + low);
	}

}