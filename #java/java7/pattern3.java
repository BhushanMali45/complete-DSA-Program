public class pattern3 {

  public static void butterfly(int n) {
    //1half
    for (int i = 1; i <= n; i++) {
      //star--i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //space--2*(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      //star --i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //2half
    for (int i = n; i >= 1; i--) {
      //star--i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //space--2*(n-i)
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      //star --i
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      //spaces  n-i
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      //star
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  ///
  public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      //spaces  n-i
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      //hollow rectangel
      for(int j=1;j<=n;j++){
        if(i==1 || i==n ||j==1 || j==n){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }

      System.out.println();
    }
}


public static void diamond(int n){
//outer
//1st half
for(int i=1;i<=n;i++){
  //space--n-i
  for(int j=1;j<=(n-i);j++){
    System.out.print(" ");
  }
//star    2*i-1
  for(int j=1;j<=((2*i)-1);j++){
    System.out.print("*");
  }

  System.out.println();
}

//ult karne
for(int i=n;i>=1;i--){
  //space--n-i
  for(int j=1;j<=(n-i);j++){
    System.out.print(" ");
  }

  for(int j=1;j<=((2*i)-1);j++){
    System.out.print("*");
  }

  System.out.println();
}
}

  public static void main(String ar[]) {
    // butterfly(4);
    // solid_rhombus(5);
    // hollow_rhombus(5);
    diamond(4);
  }
}
