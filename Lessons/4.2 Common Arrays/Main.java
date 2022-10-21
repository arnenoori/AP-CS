class Main {
  public static void main(String[] args) {
    String[] words = new String[3]; 
    words = add(words, "Newsies"); 
    words = add(words, "Phantom of the Opera"); 
    words = add(words, "Wicked");
    words = add(words, "The Muppets (2011)");
    words = add(words, "Rent");
    words = add(words, "West Side Story");
    words = add(words, "The Muppets (2011)"); 
    add(words, ""); 
    print(words); 
    removeAll(words, "The Muppets (2011)"); 
  }

  public static void removeAll(String[] words, String unwanted) { 
    // have 2 counters, one for the read position & one for the write positon 
    int read = 0, write = 0; 
    // check each spot, if unwated only the read counter increase
    while (words[read] != null) {
    if (words[read].equals(unwanted)) read++; 
    // add stuff here
    // if wanted cop from read to write and both counters increase
    else words[write++] = words[read++]; 
    } 
    while (write < read) words[write++] = null; 
  }

  public static String[] add(String[] words, String newWord) { 
    // look for an empty spot 
    for (int i = 0; i < words.length; i++) { 
      if (words[i] == null) { 
    // if we find an empty spot, copy the newWord reference in 
        words[i] = newWord;
        return words; 
      }
    }
    // if the array is full 

    //create a new larger array 
  String[] tempWords = new String[words.length * 2]; 
    // copy the old references
  for (int i = 0; i < words.length; i++) { 
    tempWords[i] = words[i];
  }
    // copy the newWord references
    tempWords[words.length] = newWord;
    return tempWords;
  }

    public static void print(Object[] stuff) {
    for (int i = 0; i < stuff.length; i++) {
      if (i < stuff.length - 1)
        System.out.print(stuff[i] + ", ");
      else
        System.out.println(stuff[i]);
    }
  }
}