import java.util.Scanner;

public class MasterTTT {
  private TTT board1;
  private TTT board2;
  private TTT board3;
  private TTT board4;
  private TTT board5;
  private TTT board6;
  private TTT board7;
  private TTT board8;
  private TTT board9;
  private String currentPlayer;
  private boolean isGameOver;
  private int currentBoard;
  private String boardWinner;

  public MasterTTT() {
    this.board1 = new TTT("1");
    this.board2 = new TTT("2");
    this.board3 = new TTT("3");
    this.board4 = new TTT("4");
    this.board5 = new TTT("5");
    this.board6 = new TTT("6");
    this.board7 = new TTT("7");
    this.board8 = new TTT("8");
    this.board9 = new TTT("9");
    this.isGameOver = false;
    this.currentPlayer = "O";
    this.currentBoard = 1;
  }

  public boolean selectNewActive(int boardNumber) {
		if (getBoardWithNumber(boardNumber).getGameOver()) {
			// we can't go here
			return false;
		}
    // // picks new random board, different from the last 
    for (int i = 1; i < 10; i++) {
      getBoardWithNumber(i).setActive(false);
    }
    getBoardWithNumber(boardNumber).setActive(true);
    currentBoard = boardNumber;
		return true;
  }

  public boolean makeMove(int moveSpot) {
    TTT selectedBoard = getBoardWithNumber(currentBoard);
    if (selectedBoard.playGame(moveSpot, currentPlayer)) {
			if (currentPlayer.equals("O")) {
				currentPlayer = "X";
			} else {
				currentPlayer = "O";
			}
			return true;
		} else {
			return false;
		}
  }

  public String getCurrentPlayer() {
    return this.currentPlayer;
  }

  public TTT getBoardWithNumber(int num) {
    if (num == 1) {
      return this.board1;
    } else if (num == 2) {
      return this.board2;
    } else if (num == 3) {
      return this.board3;
    } else if (num == 4) {
      return this.board4;
    } else if (num == 5) {
      return this.board5;
    } else if (num == 6) {
      return this.board6;
    } else if (num == 7) {
      return this.board7;
    } else if (num == 8) {
      return this.board8;
    } else if (num == 9) {
      return this.board9;
    } else {
      return new TTT();
    }
  }

  public void displayBoard() {
    String globalLine1 = Color.YELLOW + "---------------------------------------" + Color.RESET;
    String globalLine2 = board1.getLineOne() + board2.getLineOne() + board3.getLineOne();
    String globalLine3 = board1.getLineTwo() + board2.getLineTwo() + board3.getLineTwo();
    String globalLine4 = board1.getLineThree() + board2.getLineThree() + board3.getLineThree();

    String globalLine5 = Color.YELLOW + "|" + "-------------------------------------" + "|" + Color.RESET;

    String globalLine6 = board4.getLineOne() + board5.getLineOne() + board6.getLineOne();
    String globalLine7 = board4.getLineTwo() + board5.getLineTwo() + board6.getLineTwo();
    String globalLine8 = board4.getLineThree() + board5.getLineThree() + board6.getLineThree();

    String globalLine9 = Color.YELLOW + "|" + "-------------------------------------" + "|" + Color.RESET;

    String globalLine10 = board7.getLineOne() + board8.getLineOne() + board9.getLineOne();
    String globalLine11 = board7.getLineTwo() + board8.getLineTwo() + board9.getLineTwo();
    String globalLine12 = board7.getLineThree() + board8.getLineThree() + board9.getLineThree();
    String globalLine13 = Color.YELLOW + "----------------------------------------" + Color.RESET;

    String finalBoard = globalLine1 + "\n" + globalLine2 + "\n" + globalLine3 + "\n" + globalLine4 + "\n" + globalLine5
        + "\n" + globalLine6 + "\n" + globalLine7 + "\n" + globalLine8 + "\n" + globalLine9 + "\n" + globalLine10 + "\n"
        + globalLine11 + "\n" + globalLine12 + "\n" + globalLine13;
    System.out.println(finalBoard);
  }

  public boolean checkGameOver() {
    // check between boards to see if a winner has been found
    if (board1.getGameWinner().equals(board2.getGameWinner())
        && board2.getGameWinner().equals(board3.getGameWinner())) {
        isGameOver = true;
      
    } else if (board4.getGameWinner().equals(board5.getGameWinner())
        && board5.getGameWinner().equals(board6.getGameWinner())) {
        isGameOver = true;
      
    } else if (board7.getGameWinner().equals(board8.getGameWinner())
        && board8.getGameWinner().equals(board9.getGameWinner())) {
        isGameOver = true;
      
    } else if (board1.getGameWinner().equals(board4.getGameWinner())
        && board4.getGameWinner().equals(board7.getGameWinner())) {
        isGameOver = true;
      
    } else if (board2.getGameWinner().equals(board5.getGameWinner())
        && board5.getGameWinner().equals(board8.getGameWinner())) {
        isGameOver = true;
      
    } else if (board3.getGameWinner().equals(board6.getGameWinner())
        && board6.getGameWinner().equals(board9.getGameWinner())) {
        isGameOver = true;
      
    } else if (board1.getGameWinner().equals(board5.getGameWinner())
        && board5.getGameWinner().equals(board9.getGameWinner())) {
        isGameOver = true;
      
    } else if (board3.getGameWinner().equals(board5.getGameWinner())
        && board5.getGameWinner().equals(board7.getGameWinner())) {
        isGameOver = true;
      
    } else {
      isGameOver = false;
    }
    if (isGameOver) {
      boardWinner = currentPlayer;
    }
    return this.isGameOver;
  }
}
