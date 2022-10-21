import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    // Another type of data structure is a List

    List<String> words = new ArrayList<String>();

    // The big advatange is that Lists can resize

    words.add("Pineapple");
    words.add("Watermelon");

    System.out.println(words);

    // Using add with an index inserts;
    words.add(1, "Tomato");
    System.out.println(words);

    // Set will replace an object
    words.set(1, "Kiwi");
    System.out.println(words);

    words.remove(0);
    System.out.println(words);

    words.remove("Kiwi");
    System.out.println(words);

    System.out.println(words.size());
    // QUESTION ON THE QUIZ:
    // .length() is for Strings
    // .length is for arrays
    // .size() is for Lists

    System.out.println(words.remove(0));

    System.out.println(words);

    words.add("fruit");
    words.add("fruit");
    words.add("fruit");
    words.add("fruit");
    words.add("fruit");
    words.add("fruit");
    words.add("fruit");

    System.out.println(words); 
    // To remove all of an object:
    while(words.remove("fruit")); 
    System.out.println(words); 

  // CANNOT USE primitive data types such as,   
  // List<int> nms = new ArrayList<int>();

  // Instead use a wrapper class
  List<Integer> nums = new ArrayList<Iteger>(); 
  Integer num1 = new Integer(1); 
  nums.add(nums1); 

  // java uses autoboxing to turn primitives into objects for you 
  nums.add(2); 

  System.out.println(nums);
  System.out.println(nus.get(0) + nums.get(1)); 

  // What if I want to swap the values

  nums.set(nums.set(1, nums.get(0)));
  System.out.println(nums);

  }
}