import java.util.Scanner;

public class TTT {
	private String a1;
	private String a2;
	private String a3;
	private String a4;
	private String a5;
	private String a6;
	private String a7;
	private String a8;
	private String a9;
	private String currentPlayer = "";
	private boolean isGameOver;
	private String playerOwner;
	private int movesMade;

	private boolean isActive;
	private String boardWinner;

	public TTT() {
		this.a1 = "1";
		this.a2 = "2";
		this.a3 = "3";
		this.a4 = "4";
		this.a5 = "5";
		this.a6 = "6";
		this.a7 = "7";
		this.a8 = "8";
		this.a9 = "9";
		this.isGameOver = false;
		this.currentPlayer = "O";
		this.isActive = false;
		this.boardWinner = "";
		this.movesMade = 0;
	}

	public TTT(String boardPosition) {
		this.a1 = "1";
		this.a2 = "2";
		this.a3 = "3";
		this.a4 = "4";
		this.a5 = "5";
		this.a6 = "6";
		this.a7 = "7";
		this.a8 = "8";
		this.a9 = "9";
		this.isGameOver = false;
		this.currentPlayer = "O";
		this.isActive = false;
		this.boardWinner = boardPosition;
		this.movesMade = 0;
	}

	public String displayBoard() {
		return ("-------------" + "\n" + "| " + a1 + " | " + a2 + " | " + a3 + " | " + "\n" + "| " + a4 + " | " + a5 + " | "
				+ a6 + " | " + "\n" + "| " + a7 + " | " + a8 + " | " + a9 + " | " + "\n" + "-------------");
	}

	public boolean playGame(int scan, String player) {
    // checks user input and assigns to a board
		boolean isValid = true;
		if (scan == 1 && a1.equals("1")) {
			a1 = player;
		} else if (scan == 2 && a2.equals("2")) {
			a2 = player;
		} else if (scan == 3 && a3.equals("3")) {
			a3 = player;
		} else if (scan == 4 && a4.equals("4")) {
			a4 = player;
		} else if (scan == 5 && a5.equals("5")) {
			a5 = player;
		} else if (scan == 6 && a6.equals("6")) {
			a6 = player;
		} else if (scan == 7 && a7.equals("7")) {
			a7 = player;
		} else if (scan == 8 && a8.equals("8")) {
			a8 = player;
		} else if (scan == 9 && a9.equals("9")) {
			a9 = player;
		} else {
      // if invalid say this: 
			System.out.println(Color.RED + "Your input is invalid. Please enter a number 1-9 and a space that is not taken." + Color.RESET);
			isValid = false;
		}
		if (!isValid) {
			return false;
		} else {
			movesMade ++;
			this.currentPlayer = player;
			gameOver();
			return true;
		}
	}

	public String playerName() {
		if (currentPlayer.equals(Color.RED + "O" + Color.RESET)) {
			return ("Player " + Color.RED + "O" + Color.RESET + ", it is now your turn.");
		} else {
			return ("Player " + Color.BLUE + "X" + Color.RESET + ", it is now your turn.");
		}
	}

	public boolean getGameOver() {
		return isGameOver;
	}

	public void gameOver() {
    // check if individual board is won 
		if (a1.equals(a2) && a2.equals(a3)) {
			isGameOver = true;
		} else if (a4.equals(a5) && a5.equals(a6)) {
			isGameOver = true;
		} else if (a7.equals(a8) && a8.equals(a9)) {
			isGameOver = true;
		} else if (a1.equals(a4) && a4.equals(a7)) {
			isGameOver = true;
		} else if (a2.equals(a5) && a5.equals(a8)) {
			isGameOver = true;
		} else if (a3.equals(a6) && a6.equals(a9)) {
			isGameOver = true;
		} else if (a1.equals(a5) && a5.equals(a9)) {
			isGameOver = true;
		} else if (a3.equals(a5) && a5.equals(a7)) {
			isGameOver = true;
		} else {    
			isGameOver = false;
		}
		if (movesMade >= 9) {
			isGameOver = true;
			return;
		} 
		if (isGameOver) {
			boardWinner = currentPlayer;
		}
	}
  
  // methods for display board 
	public String getLineOne() {
		return getLine(a1,a2,a3);
	}

	public String getLineTwo() {
		return getLine(a4,a5,a6);
	}

	public String getLineThree() {
		return getLine(a7,a8,a9);
	}

// Coloring and coloring background:
	private String getLine(String place1, String place2, String place3) {
		String backgroundColor = "";
		String letterColor = "";
		if (this.isActive) {
			backgroundColor = Color.PURPLE_BACKGROUND;
		} else if (this.boardWinner.equals("O")) {
			backgroundColor = Color.RED_BACKGROUND;
		} else if (this.boardWinner.equals("X")) {
			backgroundColor = Color.BLUE_BACKGROUND;
		}
		if (this.isActive || "OX".indexOf(this.boardWinner) > -1) {

			String color1 = "";
			String color2 = "";
			String color3 = "";

			if ("OX".indexOf(this.boardWinner) < 0) {
				if (place1.equals("O")) {
					color1 = Color.RED_BACKGROUND;
				} else if (place1.equals("X")) {
					color1 = Color.BLUE_BACKGROUND;
				}

				if (place2.equals("O")) {
					color2 = Color.RED_BACKGROUND;
				} else if (place2.equals("X")) {
					color2 = Color.BLUE_BACKGROUND;
				}

				if (place3.equals("O")) {
					color3 = Color.RED_BACKGROUND;
				} else if (place3.equals("X")) {
					color3 = Color.BLUE_BACKGROUND;
				}
			}
			
			return backgroundColor + "|" + " " + color1 + place1 + backgroundColor + " | " + color2 + place2 + backgroundColor + " | " + color3 + place3 + backgroundColor + " "  + "|" + Color.RESET; 
		} else {

			String color1 = "";
			String color2 = "";
			String color3 = "";

			if (place1.equals("O")) {
				color1 = Color.RED;
			} else if (place1.equals("X")) {
				color1 = Color.BLUE;
			}

			if (place2.equals("O")) {
				color2 = Color.RED;
			} else if (place2.equals("X")) {
				color2 = Color.BLUE;
			}

			if (place3.equals("O")) {
				color3 = Color.RED;
			} else if (place3.equals("X")) {
				color3 = Color.BLUE;
			}

			return Color.YELLOW + "|" + Color.RESET + " " + color1 + place1 + Color.RESET + Color.YELLOW + " | " + Color.RESET + color2 + place2 + Color.RESET + Color.YELLOW + " | " + Color.RESET + color3 + place3 + Color.RESET + " "  + Color.YELLOW + "|" + Color.RESET;
		}
		
	}

	public String getGameWinner() {
		return this.boardWinner;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsActive() {
		return this.isActive;
	}
	
	public String getOwner() {
		return playerOwner;
	}

	public void setOwner(String input) {
		this.playerOwner = input;
	}

// Wipe board after every play (looks really clean when utilized)
	public static void clearScreen() {
		for (int i = 0; i < 40; i++) {
			System.out.println();
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}