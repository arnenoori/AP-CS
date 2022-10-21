import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int carDoor = (int) (Math.random() * 3 + 1);
    System.out.print("Pick a door (1-3): ");
    int userDoor = input.nextInt();

    // brute force
    int revealDoor = 0;

    // Option 1
    if (userDoor == 1) {
      if (carDoor == 1) {
        revealDoor = (int) (Math.random() * 2 + 2);
      }
      if (carDoor == 2) {
        revealDoor = 3;
      }
      if (carDoor == 3) {
        revealDoor = 2;
      }
    }
    // Option 2
    if (userDoor == 2) {
      if (carDoor == 1) {
        revealDoor = 3;
      }
      if (carDoor == 2) {
        revealDoor = (int) (Math.random() * 2 + 2);
        if (revealDoor == 0) {
          revealDoor = 3;
        }
      }
      if (carDoor == 3) {
        revealDoor = 1;
      }
    }
    // Option 3
    if (userDoor == 3) {
      if (carDoor == 1) {
        revealDoor = 2;
      }
      if (carDoor == 2) {
        revealDoor = 1;
      }
      if (carDoor == 3) {
        revealDoor = (int) (Math.random() * 2 + 1);
      }
    }
    System.out.println("Door #" + revealDoor + " has a goat. Would you like to stay or switch");

    // Get user switch choice
    String switchOrStay = input.next();
    // Use the equals method to test if two objects are equal.
    if (switchOrStay.equals("Switch")) {
      if (userDoor == 1) {
        if (revealDoor == 2) {
          revealDoor = 3;
        } else {//revealDoor was 3 
          userDoor = 2; 
        }
      } else if (userDoor == 2) {// this if will ony get used if userDoor was not 1 in the if above 
       if (revealDoor == 1) {
          userDoor = 3;
      } else { //reealDoor was  3
        userDoor = 1; 
      if (revealDoor == 2) {
      } else {//revalDoor was 3
        userDoor = 1;
      }

      }
      }
      if (userDoor == carDoor) { 
        System.out.println("you win a fake ar! Congratulations! 🚗 "); 
      } else {
        System.out.println("Congrats on your non-existant goat!"); 
      }
    }
    input.close();
    // Clears memeory and closes the scanner
}

    /*
     * The Process 
     1. Start 2. Pick the door to holding the oat
     * if (carDoor < 3) { System.out.println(goat); } else {
     * System.out.println("You won a goat "); }
     */
