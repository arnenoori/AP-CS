class Main {
  public static void main(String[] args) {
    AirplaneMenu menu = new AirplaneMenu();
    
    boolean res = menu.run();
    while (!res)
		  res = menu.run();
  }
}
