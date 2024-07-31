// public class loop9{
//     public static void main(String  args[] ){

//         for(int i =0; i<= 5;i++){
          
//           if(i==3){
//             break;
//           }

//             System.out.println(i);
//         }

//          System.out.println("i am out of the loop ");
//     }
// }


//entering a number if number is multiple of 10 then exit
import java.util.*;
public class loop9{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);



        do{
           System.out.println("enter a number");
            int n =sc.nextInt();
            if((n % 10 )== 0){
                break;
            }
            System.out.println(n);



        }while(true);
    }
}