public class pattern2 {

  public static void inverted_rotated_half_pyramid(int n) {
    //ourter loop
    for (int i = 1; i <= n; i++) {
      //space
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }





//   
public static void inverted_rotated_half_pyramid_with_numbers(int n){
    for(int i =1;i<=n;i++){


        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }

        System.out.println();
    }
}




//
public static  void floyds_triangle(int n){
    int counter=1;

    for(int i=1;i<=n;i++){

//how many times counter printed
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
        
}
}



///
public static void zero_onee_triangle(int n ){
    for(int i=1;i<=n;i++){


        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1");

            }
            else{
                 System.out.print("0");
             
            }
        }
        System.out.println();
    }
}
  public static void main(String args[]) {
    // inverted_rotated_half_pyramid(4);
    // inverted_rotated_half_pyramid_with_numbers(5);
    // floyds_triangle(5);

    zero_onee_triangle(4);
   
  }
}
