public class Employee {
  private String name;
  private double hoursWorked;
  private int idNumber;

  private static int nextId = 1;

  public Employee(String name) {
    this.name = name;
    this.idNumber = Employee.nextId++;
  }

  public double getHoursWorked() {
    return this.hoursWorked;
  }

  public void work(double work) {
    this.hoursWorked += work;
  }

  public String getName() {
    return this.name;
  }

  public int getIdNum() {
    return this.idNumber;
  }

}