import java.util.*;
public class loop11{
    public static void main(String args[]){

Scanner sc =new Scanner (System.in);
int n = sc.nextInt();

if(n == 2){
    System.out.println(" n is prime");
}
else{
boolean isprime = true;
for(int i=2; i<= Math.sqrt(n); i++){   ///n-1 pn chalel n time jast lagel


   if( (n % i) == 0 )// n is multiple of i (i not equal to 1 or n)
   {
    isprime = false;
   }
}


if(isprime == true){
    System.out.println("number prime aahe");
}

else{
    System.out.println("number  is not prime aahe");
}

}







    }
}