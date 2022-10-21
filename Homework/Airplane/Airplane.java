public class Airplane {
  // true = seat occupied;
  // false = seat available;
  private boolean[][] firstClass;
  private boolean[][] ecoClass;
  
  public Airplane() {
    firstClass = new boolean[5][4];
    ecoClass = new boolean[15][6];
  }
  
  // 0 eco 1 first
  public void getNextWindow(int type) {
    System.out.println("Running window");
    if (type == 0) {
      for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 6; j++) {
          if ((j == 0 || j == 5) && !ecoClass[i][j]) {
            ecoClass[i][j] = true;
            return;
          }
        }
      }
    } else if (type == 1) {
      System.out.println("First class");
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4; j++) {
          if ((j == 0 || j == 3) && !firstClass[i][j]) {
            System.out.println("Found");
            firstClass[i][j] = true;
            return;
          }
        }
      }
    }
    System.out.println("No seats found for those settings.");
  }
  
  public void getNextTwoFirstClass() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        if (!firstClass[i][j] && !firstClass[i][j + 1]) {
          firstClass[i][j] = true;
          firstClass[i][j + 1] = true;
          return;
        }
      }
    }
    System.out.println("No seats found for those settings.");
  }
  
  public void getNextAisle(int type) {
    if (type == 0) {
      for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 6; j++) {
          if ((j == 2 || j == 3) && !ecoClass[i][j]) {
            ecoClass[i][j] = true;
            return;
          }
        }
      }
    } else if (type == 1) {
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4; j++) {
          if ((j == 1 || j == 2) && !firstClass[i][j]) {
            firstClass[i][j] = true;
            return;
          }
        }
      }
    }
    System.out.println("No seats found for those settings.");
  }
  
  public void getNextTwoEcoClass(boolean aisle) {
    if (aisle) {
      for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
          if ((j == 1 || j == 3) && !ecoClass[i][j] && !ecoClass[i][j + 1]) {
            ecoClass[i][j] = true;
            ecoClass[i][j + 1] = true;
            return;
          }
        }
      }
    } else {
      for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
          if ((j == 0 || j == 4) && !ecoClass[i][j] && !ecoClass[i][j + 1]) {
            ecoClass[i][j] = true;
            ecoClass[i][j + 1] = true;
            return;
          }
        }
      }
    }
    System.out.println("No seats found for those settings.");
  }
  
  public void show() {
    for (int i = 0; i < 5; i++) {
      System.out.print(" " + (i + 1) + ":");
      for (int j = 0; j < 4; j++) {
        System.out.print(parseFirstClass(i, j) + " ");
      }
      System.out.println();
    }
    
    for (int i = 0; i < 15; i++) {
      if (i < 4){
        System.out.print(" ");
      }
      System.out.print((i + 6) + ":");
      for (int j = 0; j < 6; j++) {
        System.out.print(parseEcoClass(i, j));
        if (j == 2) System.out.print(" ");
      }
      System.out.println();
    }
  }
  
  private String parseFirstClass(int row, int col) {
    if (firstClass[row][col]) return "*";
    else return ".";
  }
  
  private String parseEcoClass(int row, int col) {
    if (ecoClass[row][col]) return "*";
    else return ".";
  }
}