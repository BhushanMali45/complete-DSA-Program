

// import java.util.*;
// public class multiplication {
//    public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
// int num=sc.nextInt();
// int mul;

// for(int i=1;i<=10;i++){
//   System.out.print(num*i);

// }

//    } 
// }





// //factorial
import java.util.*;
public class multiplication {
   public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int num=sc.nextInt();
int fact=1;

for(int i=1;i<=num;i++){
    fact=fact*i;
}
System.out.println(fact);

   } 
}