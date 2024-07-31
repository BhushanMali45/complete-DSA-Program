
//factorial of a number
// public class c {
//     public static void fact(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//     }
//    public static void main(String args[]){
//    fact(5);
//    } 
// }



public class c {
    public static int fact(int n){

        if(n==0){
            return 1;
        }

        // int fnm1=fact(n-1);
        // int fn=n*fnm1;
        // return fn;
        return n*fact(n-1);
    }
   public static void main(String args[]){
   System.out.println(fact(5));
   } 
}


