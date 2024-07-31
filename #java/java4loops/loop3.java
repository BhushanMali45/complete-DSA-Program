// sum of first 10 natural number
import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
      int n =sc.nextInt();
       int i =1;
       int sum = 0;


       while(i<=n){
        sum = sum + i;  //sum+= i;
        i++;
       }
        System.out.println("sum is " +sum);

    }
}