public class rrecursion3 {

  
  //fibo number
  public static int fibo(int n){

    if(n==0 || n==1){
        return n;
    }
    int fibnm1 =fibo(n-1);
     int fibnm2=fibo(n-2);
     
     int fn=fibnm1+fibnm2;
     return fn;

}   
   public static void main(String args[]) {
       int n=5;
      System.out.println( fibo(5));

      }
    }
    