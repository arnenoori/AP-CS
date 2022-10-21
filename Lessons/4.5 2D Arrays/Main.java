//4.05 2D Arrays

class Main {
  public static void main(String[] args) {
    int[][] matrix = new int[2][3];
		matrix[1][1] = 3;
		matrix[0][2] = 4;

		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[row].length; col++){
				System.out.print(matrix[row][col] + " ");
			}//at the end of a row
			System.out.println();
		}
		System.out.println();

		int[][] tttBoard = new int[3][3];

		//how do i fill it??
		for (int row = 0; row < tttBoard.length; row++){
			for (int col = 0; col < tttBoard[row].length; col++){
				tttBoard[row][col] = tttBoard[row].length * row + col + 1;
			}
		}
		print(tttBoard);

		//the user types in 5.  How do we turn that into a row and a column?
		int userInput = 6;
		int row = (userInput -1) / 3;
		int col = (userInput -1) % 3;
		System.out.println("row: " + row + " col " + col);
  }

	public static void print(int[][] matrix){
		//printing with enhanced for loops:
		for (int[] row : matrix){
			for (int num : row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

    public static void print(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i < nums.length - 1)
        System.out.print(nums[i] + ", ");
      else
        System.out.println(nums[i]);
    }
  }

}