class Main {
  public static void main(String[] args) {

int[][] matrix = new int[2][3];

matrix[0][2] = 4;

for (int row = 0; row < matrix.length; row++) { 
  // loops for columns 
  for (int col = 0; col<matrix[row].length; col++) { 
    System.out.print(matrix[row][col] + " "); 
  } // when done with the row, press the enter key 
  System.out.println(); 
} 

int[][] tttBoard = new int[3][3];

// fill the board with 1 - 9 
for (int row = 0; row < tttBoard.length; row++) { 
  for (int col = 0; col < tttBoard[row].length; col++) { 
    // figure out some math that will calculate the number (1-9) using row and col 
    tttBoard[row][col]= 3 * row + col + 1;
  }
}
print(tttBoard); 

//user types in an 8. 
int userInput = 8; 
int row = (userInput - 1) / 3;
int col = (userInput - 1) % 3;  
System.out.println(row + " " + col); 
// row = ???
// col = ???

  // How to do with enhanced for loops: 
  for (int[] row: matrix) { 
    for (int num: row) { 
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