
// public class linearsearch {


//     public static int linearsearch(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return  i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2, 4 ,6,8,10,12,14};
//         int key=10;
//        int ans= linearsearch(numbers,key);
//         System.out.println(ans);
//     }
// }


import java.util.*;
public class linearsearch{

    public static int linearsearch(int numbers[],int key){
                for(int i=0;i<numbers.length;i++){
                    if(numbers[i]==key){
                         return  i;
                     }
                 }
              return -1;
          }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int number[]=new int[size];
        
        for(int i=0;i<size;i++){
             number[i]=sc.nextInt();
        }
        int key=45;

    int ans =linearsearch(number,key);
            System.out.println(ans);

        // for(int i=0;i<size;i++){
        // System.out.print(number[i]);
        // }


    }
}