import java.awt.Rectangle;

class Main {
  public static void main(String[] args) {

    // Declaring and initializing an array
    int[] nums = new int[5];

    System.out.println(nums);
    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[2]);
    System.out.println(nums[3]);
    System.out.println(nums[4]);
    // Java auto initializes array indicies to default values: numbers go to 0,
    // booleans go to false, objects to null

    // Turn this into a method:
    print(nums);

    // Write a method that works for all objects

    // ** The great and powerful college board requires you to alawys initialize
    // your arrays. **

    nums[0] = 5;
    nums[1] = 7;

    System.out.println(nums.length);
    // legnth is a public final instancefield.
    // nums.length = 10;

    Rectangle[] boxes = new Rectangle[3];
    System.out.println(boxes[0]);

    print(boxes);

    // how can we swap the boxes at indices 0 and 2?
    Rectangle temp = boxes[0];
    boxes[0] = boxes[2];
    boxes[2] = temp;

    // can't do this, null pointer exception
    // boxes[0].setLocation(2, 3);

    boxes[0] = new Rectangle(1, 2, 3, 4);
    boxes[0].setLocation(3, 56);

    boxes[1] = new Rectangle(1, 2, 3, 4);
    boxes[1].setLocation(4, 58);

    boxes[2] = new Rectangle(1, 2, 3, 4);

    boxes[2].setLocation(5, 60);

    // Pull out this algorithm to a method
    // Swamp (boxes, 1, 2)
    
    print(boxes);
    swap(boxes, 1, 2);

    // fill a int array with the indices: 
    // nums[0] = 0; nums[1] = 1; etc. 

    fillWithIndicies(nums); 
    print(nums); 

    fillWithRandoms(nums, 17, 33); 
    print(nums);
  }

  public static void swap(Object[] stuff, int index1, int index2) {
    Object temp = stuff[index1];
    stuff[index1] = stuff[index2];
    stuff[index2] = temp;
  }

  public static void print(Object[] stuff) {
    for (int i = 0; i < stuff.length; i++) {
      if (i < stuff.length - 1)
        System.out.print(stuff[i] + ", ");
      else
        System.out.println(stuff[i]);
    }
  }

  // We can also print using a loop:
  public static void print(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i < nums.length - 1)
        System.out.print(nums[i] + ", ");
      else
        System.out.println(nums[i]);
    }
  }

  // fill an int array with the indicies 
  public static void fillWithIndicies(int[] nums) { 
    for (int i = 0; i < nums.length; i++) {
      nums[i] = i; 
  }
}

// fill an int array with random numbers between 2 values: 

public static void fillWithRandoms(int low, int high){
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * (high - low + 1) + low);
	}

} 