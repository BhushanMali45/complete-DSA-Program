// public class loop10{
//     public static void main(String  args[] ){

//         for(int i =0; i<= 5;i++){
          
//           if(i==3){
//             System.out.println("i am out of the iteration");
//             continue;
//           }

//             System.out.println(i);
//         }

//          System.out.println("i am out of the loop ");
//     }
// }


//display all the number enter by user execept 10 multiples
import java.util.*;
public class loop10{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);



        do{
           System.out.println("enter a number");
            int n =sc.nextInt();
            if((n % 10 )== 0){
                continue;
            }
            System.out.println( "display number is "+ n);



        }while(true);
    }
}