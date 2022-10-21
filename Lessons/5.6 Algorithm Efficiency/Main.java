class Main {
  public static void main(String[] args) {
// this code will time how long it takes to complete a method.
// long startTime = System.nanoTime();
// System.out.println("46th fibi number: " + iterativeFib(46));
// long stopTime = System.nanoTime();
// System.out.println("Iterative: " + (stopTime - startTime) / 1000000000.0 + " seconds");

// startTime = System.nanoTime();
// System.out.println("46th fibi number: " + recursiveFib(46));
// stopTime = System.nanoTime();
// System.out.println("Recursion: " + (stopTime - startTime) / 1000000000.0 + " seconds");

    int[] nums = getRandArray(90000, 0, 90000);

    long totalTime = 0;
    for (int i=0; i<100; i++) {
      int[] arr = nums.clone();
      long startTime = System.nanoTime();
      quickSort(arr, 0, arr.length-1);
      long endTime = System.nanoTime();
      totalTime += endTime - startTime;
    }
    double timeSeconds = totalTime / 1000000000.0;
    System.out.println("Quick Sort: " + timeSeconds / 100.0 + " seconds");

    totalTime = 0;
    for (int i=0; i<100; i++) {
      int[] arr = nums.clone();
      long startTime = System.nanoTime();
      mergeSort(arr);
      long endTime = System.nanoTime();
      totalTime += endTime - startTime;
    }
    timeSeconds = totalTime / 1000000000.0;
    System.out.println("Merge Sort: " + timeSeconds / 100.0 + " seconds");

    totalTime = 0;
    for (int i=0; i<10; i++) {
      int[] arr = nums.clone();
      long startTime = System.nanoTime();
      insertionSort(arr);
      long endTime = System.nanoTime();
      totalTime += endTime - startTime;
    }
    timeSeconds = totalTime / 1000000000.0;
    System.out.println("Insertion Sort: " + timeSeconds / 10.0 + " seconds");

    totalTime = 0;
    for (int i=0; i<10; i++) {
      int[] arr = nums.clone();
      long startTime = System.nanoTime();
      bubbleSort(arr);
      long endTime = System.nanoTime();
      totalTime += endTime - startTime;
    }
    timeSeconds = totalTime / 1000000000.0;
    System.out.println("Bubble Sort: " + timeSeconds / 10.0 + " seconds");

    totalTime = 0;
    for (int i=0; i<10; i++) {
      int[] arr = nums.clone();
      long startTime = System.nanoTime();
      selectionSort(arr);
      long endTime = System.nanoTime();
      totalTime += endTime - startTime;
    }
    timeSeconds = totalTime / 1000000000.0;
    System.out.println("Selection Sort: " + timeSeconds / 10.0 + " seconds");
}

public static int[] getRandArray(int n, int low, int high) {
    int[] nums = new int[n];
    for (int i=0; i<n; i++) {
      int rand = (int) (Math.random() * (high-low+1)) + low;
      nums[i] = rand;
    }
    return nums;
  }

	public static void quickSort(int[] nums, int low, int high) {
	// base case: if the low and high indices are pointing at or past the same
	// index, this portion is sorted.
	if (low >= high)
		return;

	// Grab the first value to be the pivot and set up the index variables
	int pivotValue = nums[low];
	int pivotIndex = low;
	int lowIndex = low;
	int highIndex = high;

	// keep looping until the low and high have settled on the pivot
	while (lowIndex < highIndex) {

		// This will start at the right side and move toward the left until it finds a
		// number smaller than the pivot value.
		while (highIndex > 0 && nums[highIndex] >= pivotValue)
			highIndex--;

		// when done moving, if the highIndex is higher than pivotIndex, that means that
		// it found a value that is on the wrong side of the pivot (too small) and so it
		// swaps the pivot with the lower value.
		if (highIndex > pivotIndex) {
			nums[pivotIndex] = nums[highIndex];
			nums[highIndex] = pivotValue;
			pivotIndex = highIndex;
		}

		// now check on the low side: start on the left and move to the right as long as
		// the values are smaller than the pivot value.
		while (lowIndex < nums.length && nums[lowIndex] <= pivotValue)
			lowIndex++;

		// if lowIndex stopped before pivotIndex, it found a value that is on the wrong
		// side (too big) and it swaps them.
		if (lowIndex < pivotIndex) {
			nums[pivotIndex] = nums[lowIndex];
			nums[lowIndex] = pivotValue;
			pivotIndex = lowIndex;
		}
	}

	// sort the two portions of the array. Notice that we do not include pivotIndex
	// in either portion as it is in its final resting place
	quickSort(nums, low, pivotIndex - 1);
	quickSort(nums, pivotIndex + 1, high);
}


	public static void mergeSort(int[] nums){
		//You can't split an array of size 1 or 0, so return (base case)
		if (nums.length <= 1)
			return;

		//Split the array into 2 halves
		int[] firstHalf = new int[nums.length/2];
		for (int f = 0; f < nums.length/2; f++)
			firstHalf[f] = nums[f];
		int[] secondHalf = new int[nums.length - firstHalf.length];
		for (int s = nums.length/2; s < nums.length; s++)
			secondHalf[s - nums.length/2] = nums[s];

		//recursively sort the two halves
		mergeSort(firstHalf);
		mergeSort(secondHalf);

		//merge the two halves in order
		int f = 0, s = 0, n = 0;
		//if there are numbers left in both halves, keep comparing them and copying the lower to nums
		while(f < firstHalf.length && s < secondHalf.length){
			if (firstHalf[f] < secondHalf[s])
				nums[n++] = firstHalf[f++];
			else
				nums[n++] = secondHalf[s++];
		}
		//when one of the arrays has been used up, copy the rest of the numbers in the other.  Only one of these loops will run.
		while (f < firstHalf.length)
			nums[n++] = firstHalf[f++];			
		while (s < secondHalf.length)
			nums[n++] = secondHalf[s++];			
	}


	public static void insertionSort(int[] nums){
		//We start at the second number as a set of 1 number is always sorted.
		for (int i = 1; i < nums.length; i++){
			int currentNumber = nums[i];
			int targetIndex = i;

			//loop from i to the left to figure out where to put currentNumber
			while ( targetIndex > 0 && currentNumber < nums[targetIndex - 1]){

				//if the number at targetIndex is bigger, move it to the right and then move targetIndex another spot to the left
				nums[targetIndex] = nums[targetIndex - 1];
				targetIndex--;
			}

			//when we get to the beginning of the array or to a number smaller than currentNumber, place currentNum back in the array
			nums[targetIndex] = currentNumber;
		}
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
			//if we do a pass without any swaps, the array must be in order
			if (!swappedSomething){
				return;
			}
		}
	}

	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int curSmallestIndex = i;
			//loop through what is unsorted and find the smallest number
			for (int j = i + 1; j < nums.length; j++){
				if (nums[j] < nums[curSmallestIndex])
					curSmallestIndex = j;
			}
			//swap the smallest number to the front of the unsorted portion which becomes the end of the sorted portion.
			int temp = nums[i];
			nums[i] = nums[curSmallestIndex];
			nums[curSmallestIndex] = temp;
		}
	}


//   public static int recursiveFib(int n) {

// if (n < 3)
// return 1;
// return recursiveFib(n - 1) + recursiveFib(n - 2);
// }

// public static int iterativeFib(int n) {
// int first = 0;
// int second = 1;
// for (int i = 0; i < n - 1; i++) {
// int newN = first + second;
// first = second;
// second = newN;
// }
// return second;
// }


}