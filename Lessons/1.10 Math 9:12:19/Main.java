import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//     System.out.println(Integer.MAX_VALUE);
//     System.out.println(Integer.MIN_VALUE);
//     System.out.println(Double.MAX_VALUE);
//     System.out.println(Double.MIN_VALUE);

//     double number = 4.35; 
//     System.out.println(100 * number);

//     int number2 = (int) number; 
//     //Casting (int) truncates (cuts off throws away) the decimal (rounds down)
//     System.out.println(number2);
//     int number3 = (int) Math.round(4.75); 
//     // Long = integers that have more digits 
//     System.out.print(number3);

//     int number4 = (int) (4.75 + 0.5);
//     System.out.println(number4);
//     //Random Numbers 

//     System.out.println(Math.random()); 
//     //Math.random() returns a value between 0 and .9999999999999999999

//     // How can I get a number between 1 and 6?

//     int die = (int) (Math.random() * 6) + 1;
//     System.out.println(die); 

//     //Pick a random laptop in the room
//     int laptop = (int) (Math.random() * 40) + 1;
//     System.out.println(laptop); 
//     // Pick a random laptop in the 21-40

//     int laptop2 = (int) (Math.random() * 20) + 21;
//     System.out.println(laptop2); 
// //Pick a rnadom number between 35 and 77426
//     int laptop3 = (int) (Math.random() * 77392) + 35;
//     System.out.println(laptop3); 
// // import java.util.Scanner; (PUT ON TOP to import)
//     Scanner input = new Scanner(System.in); 
//     System.out.print("What is your mothers maiden name?");
//     String quest = input.nextLine(); 
//     //nextLine() reads util it sees the enter key 
//     System.out.println("Thanks! I finna boonk your social security number:" + quest); 
//     // What if you want to have a number?
//     System.out.println("What is your favorite number?");
//     int favNum = input.nextInt();
//     System.out.println(favNum + " is a dumb favorite number."); 

//     // Another comon one
//     System.out.println("What are 3 words to describe youtself? (seperate with spaces"); 
//     String word1 = input.next(); 
//     // This grabs input until a white space - space, tab, or enter key 
//     String word2 = input.next();
//     String word3 = input.next();
//     System.out.println("I really don't think you are " + word2);

    // Formatting the output: 
    double price1 = 20; 
    double price2 = 25; 
    double price3 = 302.52; 

    System.out.printf("price1: $%8.2f", price1);
    System.out.printf("\nprice2: $%8.2f", price2);
    System.out.printf("\nprice3: $%8.2f", price3);
    // Print F means that the percent sign is used for something else 
    // 8.2f the f means floating point number

   


    }
}