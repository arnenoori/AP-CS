  public static String sortThreeWords(String word1,String word2, String word3) { 
  	
String first = word1;
String last = word1;

if(first.compareTo(word2) > 0) 
{ 
first = word2; 
} 
if(first.compareTo(word3) > 0) 
{ 
first = word3; 
} 
if(last.compareTo(word2) < 0) 
{ 
last = word2; 
} 
if(last.compareTo(word3) < 0) 
{ 
last = word3; 
} 
String middle;
if( !word1.equals(last) && !word1.equals(first) ) {
    middle = word1; 
} else if(!word2.equals(last) && !word2.equals(first) ) {
    middle = word2; 
}  else  {
    middle = word3; 
} 
return first + " " + middle + " " + last;
  } 