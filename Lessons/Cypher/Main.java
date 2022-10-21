import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Instructions and Rules
    System.out.println("Instructions: Enter passphrase containing only numbers, letters, and punctuation");
    System.out.println(
        "Cipher will shift the characters in the phrase forward by stated value to Encode. Cipher will shift characters back by stated value to Decode");
    System.out.println("");
    System.out.println("Rules:");
    System.out.println(" - Can be upper and/or lower case");
    System.out.println(" - Numbers may be used, but will not be changed in any sort of way");
    System.out.println(" - Punctuation may be used, but will not be changed in any sort of way");
    System.out.println("- Can only shift 1-26 characters forward");
    System.out.println("");

    Scanner enterCipher = new Scanner(System.in);

    System.out.println("Are you encoding or decoding a passphrase? Type 'encoding' or 'decoding'");
    String userChoiceEntry = enterCipher.nextLine();
    String edChoice = userChoiceEntry.toLowerCase();
    if (!(edChoice.equals("encoding") || edChoice.equals("decoding"))) {
      System.out.print("Did not enter 'encoding' or 'decoding' correctly, please retry again");
      System.exit(1);
    } else {
      System.out.println("");
      System.out.println("Input accepted!");
      System.out.println("");
    }

    // User inputs passphrase
    System.out.println("Enter passphrase: ");
    String userText = enterCipher.nextLine();

    // User inputs how much each character will be shifted by
    System.out.println("Enter a value between 1 and 26 by which how much each character is shifted");
    int shiftText = enterCipher.nextInt();

    System.out.println("");

    if (shiftText < 0 || shiftText > 27) {
      System.out.println(
          "Did not enter value for which text will be shifted inside the stated range of 1-26, please retry again");
      System.exit(1);
    }

    else {
      System.out.println("Everything looks good! Time to start " + edChoice);
    }

    Cipher c = new Cipher();
    String uText = c.encryptMessage(userText);
    int sText = c.encryptMessage(shiftText);
/*
  if (edChoice.equals("encoding")){
    System.out.println("Your encoded message is " + encryptMessage);
  }
  else if (edhoice.equals("decoding")){
    System.out.println("Your decoded message is " + decryptMessage);
  }
*/

  // System.out.println("Your encoded message: "+cipherText);
  
  } // end of public static void

  /*
   * public class Cipher {
   * 
   * private char singleLetter; private String encryptMessage= "";
   * 
   * public String getEncryptMessage(){ return encryptMessage; }
   * 
   * public static void encryption(){
   * 
   * // String encryptMessage = ""; // Start of for loop to go through each letter
   * and shift it for (int i = 0; i < getUserText.length(); i++) { singleLetter =
   * getUserText.charAt(i);
   * 
   * // LOWERCASE SHIFT: // If singleLetter lies between a and z. Prevents any
   * symbols from being included in cipher and keeps it within the alphabet if
   * (singleLetter >= 'a' && singleLetter <= 'z') {
   * 
   * // shift singleLetter by integer stated by user in shiftText singleLetter =
   * (char) (singleLetter + getShiftText);
   * 
   * // if the character is not within a-z if (singleLetter > 'z') {
   * 
   * // then reshift back into alphabet range by subtracting z-a range from the
   * char singleLetter = (char) (singleLetter - ('z' - 'a' + 1));
   * 
   * }
   * 
   * // cipherText with lowercase shifted encryptMessage = encryptMessage +
   * singleLetter;
   * 
   * } // end of if(singleLetter >= 'a' && singleLetter <= 'z')
   * 
   * // UPPERCASE SHIFT: // if singleLetter lies between 'A'and 'Z' else if
   * (singleLetter >= 'A' && singleLetter <= 'Z'){ singleLetter =
   * (char)(singleLetter + getShiftText);
   * 
   * // if shift singleLetter greater than 'Z' if (singleLetter > 'Z') {
   * 
   * // be carried over into a and shift from there. singleLetter = (char)
   * (singleLetter - ('Z' - 'A' + 1)); }
   * 
   * encryptMessage = encryptMessage+singleLetter;
   * 
   * } // end of else if(singleLetter >= 'A' && singleLetter <= 'Z')
   * 
   * else{ encryptMessage = encryptMessage + singleLetter; }
   * 
   * } // end of for loop } // end of public static void } // end of cipher class
   * 
   */
} // end of main class