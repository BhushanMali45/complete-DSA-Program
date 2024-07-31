public class recursion2 {

  
  //fact
  public static int fact(int n){
    if(n==0){
        return 1;
    }

    int fnm1= fact(n-1);
    // int fn=n*fact(n-1);
     int fn=n*fnm1;

    return fn;
  }




// //sum
// public static int calculatesum(int n){
//     if(n==1){
//         return 1;
//     }

//     int fnm1= calculatesum(n-1);
//     // int fn=n+fnm1;
//     int fn=n+calculatesum(n-1);
//     return fn;
// }
  
    public static void main(String args[]) {
     int n=5;
   System.out.println(fact( 5));
//  System.out.println(calculatesum(5));

    }
  }
  