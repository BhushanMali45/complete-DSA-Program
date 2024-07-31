// public class i {
//     //x^n calculate
//     //x^n=x*x^n-1

//     public static int pow(int x,int n){

//         if(n==0){
//             return 1;
//         }

//         // int xnm1=pow(x, n-1);
//         // int xn=x*xnm1;
//         // return xn;
//         //
//         return  x* pow(x, n-1);


//     }
//    public static void main(String args[]){
//     System.out.println(pow(2, 10));

//    } 
// }












//nlogn
public class i {
    //x^n calculate
    //x^n=x*x^n-1

    public static int pow(int x,int n){

        if(n==0){
            return 1;
        }
      


        int halfpower=pow(x, n/2);
        

        //even
        int halfpowersq=halfpower*halfpower;
        //odd
        if(n%2!=0){
halfpowersq=x*halfpowersq;
        }

        return halfpowersq;
   


    }
   public static void main(String args[]){
    System.out.println(pow(2, 10));

   } 
}

