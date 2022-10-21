import java.util.Scanner;

// Psuedocode 
// Choose which board
// Display that board
// Play in that board 
// Switch to a different board
// If a board is won play anywhere 
// Check if big board is won

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Scanner boardScan = new Scanner(System.in);
    MasterTTT board = new MasterTTT();
    board.displayBoard();
    int lastMove = 0;
    System.out
        .println(Color.YELLOW + "Welcome Ultimate Ticky Tacky Toe! Choose with numbers 1-9 to begin." + Color.RESET);
    System.out.println("Player 1. You are " + Color.RED + "O" + Color.RESET);
    System.out.println("Player 2. You are " + Color.BLUE + "X" + Color.RESET);
  
    /*while (!board.checkGameOver()) {
      if (lastMove == 0){
        int boardScan = boardScan();
      } else {
        gameOver = 0;
      }
    }*/
      //in a loop:
        //if last move is set to 0, ask the user which board they want to use.
        //check here if the last move board was gameOver, if so, set to 0.
    boolean shouldPickBoard = true;
    while(!board.checkGameOver()) { 

			if (board.getBoardWithNumber(lastMove).getGameOver()) {
				shouldPickBoard = true;
			}
      // do while not make move
			if (shouldPickBoard) {
				// ask player for which board they want to play
				do {
					System.out.print("Pick the board (1-9): ");
					lastMove = scan.nextInt();
				} while ((lastMove > 9 && lastMove < 1) || board.getBoardWithNumber(lastMove).getGameOver());
				shouldPickBoard = false;
			}

			board.selectNewActive(lastMove);

			TTT.clearScreen();
			board.displayBoard();

      // check if move is valid
      int input = -1;
			boolean isValidMove = false;
      do {
        System.out.print(board.getCurrentPlayer() + "'s Turn: ");
        input = scan.nextInt();
        isValidMove = board.makeMove(input);
      } while (!isValidMove); 
			
      lastMove = input;
		}
		TTT.clearScreen();
		board.displayBoard();
		System.out.println("WINNER!");
    
  }
}