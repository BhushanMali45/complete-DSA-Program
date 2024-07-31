//climbling the stair recursion
// public class dp2 {

//     public static int countways(int n){
//        if(n==0){
//         return 1;
//        }

//        if (n<0) {
//         return 0;
//        }

//         return countways(n-1)+countways(n-2);
//     }
//    public static void main(String args[]){
// int n=5;
// System.out.println(countways(n));
//    } 
// }



//dp

import java.util.Arrays;

public class dp2 {

    public static int countways(int n,int ways[]){

       if(n==0){
        return 1;
       }

       if (n<0) {
        return 0;
       }
       if(ways[n]!=-1){
        return ways[n];
       }

        return ways[n]= countways(n-1,ways)+countways(n-2,ways);
    }
   public static void main(String args[]){
int n=5;
int ways[]=new int[n+1];
Arrays.fill(ways, -1);//-1
System.out.println(countways(n,ways));
   } 
}
