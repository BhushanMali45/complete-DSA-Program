public class pattern1 {

  public static void hollow_rectangle(int tolrows, int tolcolumn) {
    //outer
    for (int i = 1; i <= tolrows; i++) {
      //inner loop
      for (int j = 1; j <= tolcolumn; j++) {
        //cell -(i,j)
        if (i == 1 || i == tolrows || j == 1 || j == tolcolumn) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    hollow_rectangle(4, 5);
  }
}
