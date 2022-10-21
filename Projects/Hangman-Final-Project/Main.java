import java.util.Scanner;
import java.util.Random; 

public class Main {
  public static void main(String[] args) { 

Scanner scanner = new Scanner(System.in); 
Random random = new Random(); 
String[] guesses = {"computerscience", "mrkinney", "kia.nooshi", "hangman", "test"}; // word database (but want this to be user input)
String[] guessesBlank = new String[1];
Aass
boolean playGame = true;
while (playGame) { 
  System.out.println("Welcome to Hangman!");
  System.out.println("Would you like to play with one or two players? Type 1 for one player or 2 for two players.");
  int gameType = Integer.parseInt(scanner.nextLine());
  // System.out.print(gameType);
  while((!(gameType==1) || !(gameType==2))==false){
    System.out.println("That was not one of the acceptable inputs. Please type 1 for one player or 2 for two players.");
    gameType = Integer.parseInt(scanner.nextLine());
    }
  // if(gameType == 1){
  // char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray(); }
  if(gameType == 2){
    System.out.println("Player One Please Enter a word that player two will guess. What is your word?");
    String temp2 = scanner.nextLine();
    // System.out.println(temp2);
    guessesBlank[0] = temp2;
    guesses = guessesBlank;
  }
  char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray(); // grabs from String[] guesses and picks a random word
  int amountOfGuesses = randomWordToGuess.length;
  char[] playerGuess = new char[amountOfGuesses];

  for (int i = 0; i < playerGuess.length; i++) { 
    playerGuess[i] = '_'; 
  }

  boolean wordIsGuessed = false; 
  int tries = 0; 

  while (!wordIsGuessed && tries != amountOfGuesses && playGame == true) { 
    System.out.print("Current guesses: ");
    printArray(playerGuess); 
    System.out.printf("You have %d tries left.\n", amountOfGuesses - tries); // calculates number of tries left
    System.out.println("Enter a letter to get started.");
    char input = scanner.nextLine().charAt(0); // only accepts first character using char
    tries++; 

    if (input == '_') {
      playGame = false;
      wordIsGuessed = true; 
    } else { 
      for (int i = 0; i < randomWordToGuess.length; i++) {
          if (randomWordToGuess[i] == input) { 
              playerGuess[i] = input; 
          }
      }

      if (isTheWordGuessed(playerGuess)) { 
          boolean worldIsGuessed = true;
          System.out.println(Color.GREEN + "Congratulations you won!" + Color.RESET); 
          playGame = false;
      }

    if (!wordIsGuessed && tries == amountOfGuesses && playGame != false) { 
        System.out.println(Color.RED + "You ran out of guesses." + Color.RESET);
      }


    }


  }

  System.out.println("Do you want to play another game? (yes or no)"); 
  String anotherGame = scanner.nextLine();
  if (anotherGame.equals("yes")){ playGame = true;}

}

System.out.println("Game is now over.");

  }

public static void printArray(char[] array) { 
  for (int i = 0; i < array.length; i++) { 
    System.out.print(array[i] + " ");
  }
    System.out.println();
}

public static boolean isTheWordGuessed(char[] array) { 
  for (int i = 0; i < array.length; i++) {
    if (array[i] == '_') return false;
  } 
  return true; 
}


}