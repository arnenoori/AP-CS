public class Cipher {

  private char singleLetter;
  public String encryptMessage;
  private String uText;
  private int sText;

  public Cipher(){
   this.encryptMessage = "";
   this.uText = "";
   this.sText = 0;  
  }

  public Cipher(String uText, int sText){
    this.uText = uText;
    this.sText = sText;
  }

  public String getUserText(){
    return this.uText;
  }

  public int getShiftText(){
    return this.sText;
  }

 public String encryptMessage(String uText, int sText){ 

   String encryptMessage = "";
   // Start of for loop to go through each letter and shift it 
   for (int i = 0; i < getUserText.length(); i++) { singleLetter = getUserText.charAt(i);
  
    // LOWERCASE SHIFT: 
    // If singleLetter lies between a and z. Prevents any symbols from being included in cipher and keeps it within the alphabet 
    if (singleLetter >= 'a' && singleLetter <= 'z') {
  
    // shift singleLetter by integer stated by user in shiftText 
    singleLetter = (char) (singleLetter + getShiftText);
  
    // if the character is not within a-z
    if (singleLetter > 'z') {
  
  // then reshift back into alphabet range by subtracting z-a range from the char
  singleLetter = (char) (singleLetter - ('z' - 'a' + 1));

    }

  // cipherText with lowercase shifted 
  encryptMessage = encryptMessage + singleLetter;

  } // end of if(singleLetter >= 'a' && singleLetter <= 'z')

  // UPPERCASE SHIFT:
  // if singleLetter lies between 'A'and 'Z' 
  else if (singleLetter >= 'A' && singleLetter <= 'Z'){ 
  singleLetter = (char)(singleLetter + getShiftText);

  // if shift singleLetter greater than 'Z' 
  if (singleLetter > 'Z') { 
  
  // be carried over into a and shift from there. 
  singleLetter = (char) (singleLetter - ('Z' - 'A' + 1)); }

  encryptMessage = encryptMessage+singleLetter;

} // end of else if(singleLetter >= 'A' && singleLetter <= 'Z')

else{
encryptMessage = encryptMessage + singleLetter;
}

} // end of for loop
} // end of public static void

/*

 public static void Decoder(){
  for(int i=0; i < getUserText.length();i++){
  string decryptMessage = "";
  // Go through each character at a time
   char singleLetter = getUserText.charAt(i);
    // if singleLetter lies between a and z 
    if(singleLetter >= 'a' && singleLetter <= 'z'){
    // shift singleLetter
      singleLetter = (char) (singleLetter - shift);     

      if(singleLetter < 'a') {
      //reshift to starting position 
       singleLetter = (char) (singleLetter - ('z' - 'a' + 1));
      }
        decryptMessage = decryptMessage + singleLetter;
    }    
                // if singleLetter lies between A and Z
     else if(singleLetter >= 'A' && singleLetter <= 'Z'){
      // 
      singleLetter = (char) (singleLetter - shift); 
        if (singleLetter < 'A') {
         // reshift to starting position 
         singleLetter = (char) (singleLetter - ('Z' - 'A' + 1));
         }
          decryptMessage = decryptMessage + singleLetter;
     }
   else {
    decryptMessage = decryptMessage + singleLetter;         } 
   }// End of for loop

 } // end of Decoder

*/

} // end of class


 