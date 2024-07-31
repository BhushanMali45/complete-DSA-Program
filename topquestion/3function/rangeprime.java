public class rangeprime {

public static boolean isPrime(int n){

    ///corner case
    if(n==2){
       boolean isPrime=true;
    }
    boolean isPrime=true;
    for(int i=2;i<=Math.sqrt(n);i++){
  if(n%i==0){
    isPrime=false;
    break;
  }

    }
    return isPrime;
}



public static void primerange(int n){
    for(int i=2;i<=n;i++){
       if( isPrime(i)){
        //true
        System.out.print(i +" ");
       }
    }
    System.out.println();
}

   public static void main(String args[]){
primerange(20);
   } 
}
