public class Mastermind{
  private String code;
  private boolean gameOver;
  private int guesses = 0;
  public Mastermind (String code){
    this.code = code.toLowerCase();
  }
  
  public String getDirections(){
    return "Welcome to Mastermind.  You are the codebreaker.  Your job is to guess the pattern in both letter and order.  There are 6 available letters (A-F) and they will not repeat.  You will have 8 guesses.  After each guess you will learn the number of letters that are correct and in the right spot as well as the number of letters that are correct but in the wrong spot.  Guess by entering 4 letters between A and F with no spaces.  Good luck!";
  }
  
  public String guess (String guess){
    guess = guess.toLowerCase();
    if (guess.length()>4 || guess.length()<4){
      guesses++;
      return "You must guess 4 letters.  You have wasted a guess.";
      
    }
    String first = guess.substring(0,1);
    String second = guess.substring(1,2);
    String third = guess.substring (2,3);
    String fourth = guess.substring (3,4);
    
    String firstr = code.substring(0,1);
    String secondr = code.substring(1,2);
    String thirdr = code.substring (2,3);
    String fourthr = code.substring (3,4); 
    
    if (first.equals(second)||first.equals(third)||first.equals(fourth)||second.equals(third)||second.equals(fourth)||third.equals(fourth)){
      guesses++;
      return "You cannot repeat any characters.  You have wasted a guess.";
    }
    
    int guessesRight = 0;
    int positionRight = 0;
    if (first.equals(firstr)){
      guessesRight++;
    }
    else if (first.equals(secondr) || first.equals(thirdr) || first.equals(fourthr)){
      positionRight++;
    }
    if (second.equals(secondr)){
      guessesRight++;
    }
    else if (second.equals(firstr) || second.equals(thirdr) || second.equals(fourthr)){
      positionRight++;
    }
    if (third.equals(thirdr)){
      guessesRight++;
    }
    if (third.equals(firstr) || third.equals (secondr) || third.equals(fourthr)){
      positionRight++;
    }
    if (fourth.equals(fourthr)){
      guessesRight++;
    }
    if (fourth.equals(firstr) || fourth.equals(secondr) || fourth.equals(thirdr)){
      positionRight++;
    }
    if (guessesRight == 4){
      gameOver = true;
      return "Congratulations, you are correct!";
    }
    if (guesses>7){
      return "You had 0 letters in the correct spot and 4 correct letters in the wrong spot.  You are out of guesses.  Better luck next time.";
    }
    guesses++;
    return "You had " + guessesRight + " letters in the correct spot and " + positionRight + " correct letters in the wrong spot."; 
    
    }
  public int getGuessesUsed(){
      return guesses;
    }
  public boolean getGameOver(){
    if (gameOver){
      return true;
    }
    else if (guesses>7){
      return true;
    }
    else{
      return false;
    }
  }
}