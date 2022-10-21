import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the start time in HH MM format.");
    int startHours = in.nextInt();
    int startMinutes = in.nextInt();
    System.out.println("Enter the task time in HH MM format.");
    int taskHours = in.nextInt();
    int taskMinutes = in.nextInt();    
    int finishHours;
    int finishMinutes;
    //Don't edit above this
    
class Time {
  public static void time(String[] args) {

    int finishHours = (int) (Math.random() * 24);
     System.out.println(finishHours);
    
    int finishMinutes = (int) (Math.random() * 60)+ 1;
     System.out.println(finishMinutes);
    
  }
}
    
    //Don't edit below this
    System.out.println("The task will finish at " + finishHours + ":" + finishMinutes);
  }
}