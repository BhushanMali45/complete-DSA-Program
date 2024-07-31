public class recursion1 {

  // public static void printdecre(int n) {
  //   if (n == 1) {
  //     System.out.println(n);
  //     return;
  //   }
  //   System.out.print(n + " ");

  //   printdecre(n - 1);
  // }




  //increase
  public static void printincre(int n){
    if (n == 1) {
      System.out.print(n+ " ");
      return;
    }

    printincre(n-1);
    System.out.print(n + " ");


  }

  public static void main(String args[]) {
    int n = 10;
    // printdecre(n);
    printincre(n);
  }
}
