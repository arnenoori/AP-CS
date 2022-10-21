import java.util.Scanner;

public class AirplaneMenu {
  private Airplane plane;
  
  public AirplaneMenu() {
    plane = new Airplane();
  }
  
  public boolean run() {
    Scanner s = new Scanner(System.in);
    System.out.println("(A)dd \t (S)how \t (Q)uit");
    String cmd = s.next();
    while (!validCommand(cmd)) {
      System.out.println("Invalid command.");
      System.out.println("(A)dd \t (S)how \t (Q)uit");
      cmd = s.next();
    }
    
    if (cmd.equalsIgnoreCase("a")) {
      System.out.println("(F)irst \t (E)conomy");
      cmd = s.next();
      if (cmd.equalsIgnoreCase("f")) {
        System.out.println("Passengers? (1-2)");
        int passengers = s.nextInt();
        
        if (passengers == 1) {
          System.out.println("(A)isle \t (W)indow");
          cmd = s.next();
          if (cmd.equalsIgnoreCase("a")) {
            plane.getNextAisle(1);
          } else if (cmd.equalsIgnoreCase("w")) {
            plane.getNextWindow(1);
          }
        } else if (passengers == 2) {
          plane.getNextTwoFirstClass();
        }
        
      } else if (cmd.equalsIgnoreCase("e")) {
        System.out.println("Passengers? (1-3)");
        int passengers = s.nextInt();
        
        if (passengers == 1) {
          System.out.println("(A)isle \t (W)indow");
          cmd = s.next();
          if (cmd.equalsIgnoreCase("a")) {
            plane.getNextAisle(0);
          } else if (cmd.equalsIgnoreCase("w")) {
            plane.getNextWindow(0);
          }
        } else if (passengers == 2) {
          System.out.println("(A)isle \t (W)indow");
          cmd = s.next();
          plane.getNextTwoEcoClass(cmd.equalsIgnoreCase("a"));
        }
        
      } else System.out.println("Invalid option.");
    } else if (cmd.equalsIgnoreCase("s")) {
      plane.show();
    } else if (cmd.equalsIgnoreCase("q")) {
      return true;
    }
    return false;
  }
  
  public boolean validCommand(String in) {
    return (!in.equalsIgnoreCase("A") || !in.equalsIgnoreCase("S") || !in.equalsIgnoreCase("Q"));
  }
}