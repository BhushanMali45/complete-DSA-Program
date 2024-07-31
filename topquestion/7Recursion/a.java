///print the number in decreasing order
// public class a{

     
//     public static  void printnumber(int n){
//         for(int i=10;i>=1;i--){
//             System.out.print(i);
//         }
//     }
//     public static void main(String ars[]){
//     printnumber(10);
//     }
// }




//using recursion
public class a{

     public static void printnumber(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n);
        printnumber(n-1);
     }
    
    public static void main(String ars[]){
        printnumber(10);
   
    }
}