import java.util.ArrayList;

public class Hangman {
  private String word;
  private ArrayList<String> template;
  private int livesLeft = 6;
  private ArrayList<String> guessedLetters;
  private boolean isGameOver = false;
  private boolean didWin = false;

  public Hangman(String word) {
    this.word = word.toLowerCase();
    this.guessedLetters = new ArrayList<String>();
    this.template = new ArrayList<String>();

    for (int i = 0; i < word.length(); i++) {
      String curChar = word.substring(i, i + 1);
      if (!curChar.equals(" ")) {
        template.add("_");
      } else {
        template.add(" ");
      }
    }
  }

  public boolean guess(String letter) {
    letter = letter.toLowerCase();

    guessedLetters.add(letter);

    if (!word.contains(letter)) {
      // Got it wrong
      livesLeft--;
      return false;
    }

    for (int i = 0; i < word.length(); i++) {
      if (word.substring(i, i + 1).equals(letter)) {
        template.set(i, letter);
      }
    }

    return true;
  }

  public boolean isValidGuess(String guess) {
    String letters = "abcdefghijklmnopqrstuvwxyz";

    if (!letters.contains(guess.toLowerCase()) || guess.length() != 1) {
      System.out.println("Invalid guess, must be a letter.");
      return false;
    } else if (guessedLetters.contains(guess.toLowerCase())) {
      System.out.println("Already guessed!");
      return false;
    }
    return true;
  }

  private void printTemplate() {
    for (String letter : template) {
      System.out.print(letter.toUpperCase());
      System.out.print(' ');
    }
    System.out.println();
  }

  private void printGuesses() {
    for (String letter : guessedLetters) {
      System.out.print(letter.toUpperCase() + " ");
    }
  }

  private void printMan() {
    System.out.println("______");
    System.out.print("|    |     ");
    // Add guessed letters
    printGuesses();
    System.out.println();

    if (livesLeft == 6) {
      System.out.println("|");
      System.out.println("|");
      System.out.println("|");
    } else if (livesLeft == 5) {
      System.out.println("|    O");
      System.out.println("|     ");
      System.out.println("|");
    } else if (livesLeft == 4) {
      System.out.println("|    O");
      System.out.println("|    |");
      System.out.println("|  ");
    } else if (livesLeft == 3) {
      System.out.println("|    O");
      System.out.println("|   /|");
      System.out.println("|   ");
    } else if (livesLeft == 2) {
      System.out.println("|    O");
      System.out.println("|   /|\\ ");
      System.out.println("|   ");
    } else if (livesLeft == 1) {
      System.out.println("|    O");
      System.out.println("|   /|\\ ");
      System.out.println("|   /");
    } else if (livesLeft == 0) {
      System.out.println("|    O");
      System.out.println("|   /|\\ ");
      System.out.println("|   / \\");
    }
    System.out.println("|__________");
  }

  public void printUI() {
    printMan();
    printTemplate();
  }

  public void checkGameOver() {
    if (this.livesLeft == 0) {
      this.isGameOver = true;
      this.didWin = false;
    }
    boolean didWin = true;
    for (String letter : template) {
      if (letter.equals("_")) {
        didWin = false;
      }
    }
    if (didWin) {
      this.isGameOver = true;
      this.didWin = true;
    }
  }

  public boolean getIsGameOver() {
    return this.isGameOver;
  }

  public boolean getDidWin() {
    return this.didWin;
  }
}