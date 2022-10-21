class Main {
  public static void main(String[] args) {
System.out.println(wordPlay("Computer Science"));
}


public String wordPlay(String word)

{

String str = "";

for (int k = 0; k < word.length(); k++)

{

if (k % 3 == 0)

{

str = word.substring(k, k + 1) + str;

}

}

return str;
}
}