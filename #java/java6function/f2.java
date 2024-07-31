import java.util.*;
public class f2{


public static void printhelloworld(){
    System.out.println("helloo");
}

public static int calculator(int a,int b){  //parameter or formal parameter

int sum =a+b;
return sum;

}


    public static void main(String args[]){
        //main function execution start from here
printhelloworld();

////

Scanner sc =new Scanner(System.in);
int a =sc.nextInt();
int b =sc.nextInt();
int sum= calculator(a,b);// aruguments or actual parameter
 System.out.println("sum is :"+sum);



    }
}