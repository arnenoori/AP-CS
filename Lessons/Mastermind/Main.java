import java.util.Scanner;

class Main {
 public static void main(String[] args) {
    System.out.println("\n\n");
    Mastermind game = new Mastermind("FACE");
    System.out.println(game.getDirections());
    Scanner in = new Scanner(System.in);
    while (true){
			while (!game.getGameOver()){
		    System.out.print("\n\nPlease make guess number " + (game.getGuessesUsed() + 1) + ":  ");
		    String guess = in.nextLine();
		    System.out.println("\n" + game.guess(guess));
			}
			System.out.println("\nWould you like to play again? (yes or no)\n");
			if (in.nextLine().toLowerCase().equals("no")){
				System.out.println("\nHave a nice day.");
				return;
			}
			//this starts a new game with the same preset code.  See challenge level 1 to make this more interesting.
			game = new Mastermind("FACE");
    }
	}
}