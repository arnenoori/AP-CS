class Main {
  public static void main(String[] args) {
    String str = "race car"; 
    String str2 = "Was it a car or a cat I saw?"; 
    String str3 = "A man, a plan, a canal, Panama.";
    String str4 = "Bob"; 
    System.out.println(isPalindrome(str)); 
    System.out.println(isPalindrome(str2)); 
    System.out.println(isPalindrome(str3)); 
  }

  public static boolean isPalindrome(String str) { 
    return isPalindrome(str.toLowerCase(), 0, str.length() - 1); 
  }

  // This is not elegant annd I do not trust anyone else to give the correct indices
  // Instead, turn this into a private helper method. 
  // Version 2: use indices instead of creatinng strings

  // VERSION 2: Use indices instead of creating strings

		public static boolean isPalindrome(String str, int first, int last){
		str = str.toLowerCase();

		//basecase: if the string is 0 or 1 characters, it is a palindrome
		if (last - first < 1)
			return true;

		String firstLetter = str.substring(first, first + 1);
		String lastLetter = str.substring(last, last + 1);

		//check if first character is a letter.  If not, throw it out:
		if (firstLetter.compareTo("a") < 0 || firstLetter.compareTo("z") > 0)
			return isPalindrome(str, first + 1, last);

		//check if last character is a letter.
		if (lastLetter.compareTo("a") < 0 || lastLetter.compareTo("z") > 0)
			return isPalindrome(str, first, last - 1);

		//check if the first and last are the same
		if (firstLetter.equals(lastLetter))
			//cut off the first and last and check the rest
			return isPalindrome(str, first + 1, last - 1);

		//if the first and last are not the same:
		return false;
	}


  // public static boolean isPalindrome(String str) { 
  //   System.out.println(str); 
  //   str = str.toLowerCase(); 
  //   // basecase: if the stringn is 0 or 1 characters, it is a palindrome
  //   if (str.length() < 2)
  //     return true; 

  //   // check if first character is a letter. If not, throw it out: 
  
  //   if (str.substring(0, 1).compareTo("a") < 0 || str.substring(0,1).compareTo("z") > 0)
  //     return isPalindrome(str.substring(1));

  //   // check if last character is a letter.
  //   if (str.substring(str.length() - 1).compareTo("a") < 0 || str.substring(str.length() - 1).compareTo("z") > 0) 
  //     return isPalindrome(str.substring(0,str.length() -1)); 

  //   // check if the first and last are the same 
  //   if (str.substring(0, 1).equals(str.substring(str.length() - 1))) 
  //   // cut off the first and last annd check the rest
  //     return isPalindrome(str.substring(1, str.length() - 1));
      
  //   // if the first and last are not the same: 
  //   return false; 
  // }
    
}