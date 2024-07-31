// // claculate fibonacci

// public class e{
//     public static void fib(int n) {
//         int firstfib = 0;
//         int secondfib = 1;
//         System.out.print(firstfib + " ");
//         System.out.print(secondfib + " ");

//         for (int i = 2; i < n; i++) { // corrected loop termination condition
//             int nextnumber = firstfib + secondfib;
//             firstfib = secondfib;
//             secondfib = nextnumber;
//             System.out.print(nextnumber + " ");
//         }
//     }

//     public static void main(String args[]) {
//         fib(5);
//     }
// }













public class e {

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;

        }

        // int fnm1=fibo(n-1);
        // int fnm2=fibo(n-2);
        // int fn=fnm1+fnm2;
        // return fn;

        return fibo(n-1)+fibo(n-2);
    }
   public static void main(String[] bhushan){
    System.out.println(fibo(4));
//     int n=10;
//     for(int i=0;i<n;i++){
//  System.out.print(fibo(i)+" ");
//     }
         
   } 
}
