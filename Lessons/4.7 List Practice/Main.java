import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
// Create a list to hold ints and fill it with 10 random numbers. 
List <Integer> random = new ArrayList<Integer>(); 
for (int i = 0; i < 10; i++) { 
  int rando = (int) (Math.random() * 20);
  random.add(rando); 
}
  System.out.println(random);

  // Remove the 4th number 
    random.remove(3);
    System.out.println(random);
  // Insert at Index 7 double the value of index 8
  random.add(random.get(8) * 2);
  System.out.println(random); 
  // change index 2 to be half of index 9 
  random.set(2, random.get(9) / 2); 
  System.out.println(random);

    // Write 1 line of code to swap the first and last items
  random.set(0, random.set(random.size() - 1, random.get(0))); 
  System.out.println(random); 

  // Pick a sorting algorithm and write a method to sort a list of ints with it. 
  }

	public static void bubbleSort(int[] nums){
		for (int j = 0; j < nums.length - 1; j++){
			boolean swappedSomething = false;
			//in each pass: compare each pair, bigger ends on the right.
			for (int i = 0; i < nums.length - 1 - j; i++){
				if (nums[i] > nums[i+1]){
					//swap them
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					swappedSomething = true;
				}
			}
			if (!swappedSomething){
				return;
			}
		}
	}

}