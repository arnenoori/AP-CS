class Main {
	public static void main(String[] args){
		//this is an array literal.  you can use these to initialize arrays.    
		int[] nums = { 2, 6, 4, 3, 3, 1};
		print(nums);
		bubbleSort(nums);
		print(nums);
	}

	//if the data is sorted
	public static int binarySearch(int[] nums, int numToFind){
		int lowIndex = 0, highIndex = nums.length - 1;
		while (lowIndex <= highIndex){
			int midIndex = (lowIndex + highIndex) / 2;
			int midNumber = nums[midIndex];
			if (midNumber == numToFind){
				return midIndex;
			}
			if (midNumber > numToFind){ //look lower
				highIndex = midIndex - 1;
			} else { //look higher
				lowIndex = midIndex + 1;
			}
		}
		return -1;
	}

	//returns the first occurrence of numToFind.  If numToFind is not in the array it returns -1.
	public static int indexOf(int[] nums, int numToFind){
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == numToFind){
				return i;
			}
		}
		return -1;
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

	public static void insertionSort(int[] nums){
		for (int i = 1; i < nums.length; i++){
			int currentNumber = nums[i];
			int targetIndex = i;
			//loop here to the left to figure out where to put currentNumber
			while ( targetIndex > 0 && currentNumber < nums[targetIndex - 1]){
				nums[targetIndex] = nums[targetIndex - 1];
				targetIndex--;
			}
			nums[targetIndex] = currentNumber;
		}
	}

	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int curSmallest = i;
			for (int j = i + 1; j < nums.length; j++){
				if (nums[j] < nums[curSmallest])
					curSmallest = j;
			}
			int temp = nums[i];
			nums[i] = nums[curSmallest];
			nums[curSmallest] = temp;
		}
	}

	public static void print(int[] nums) {
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
	}
}