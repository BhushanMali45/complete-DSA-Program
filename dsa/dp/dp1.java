//fibo using recursion
// public class dp1{

//     public static int fib(int  n){
//     if(n==0 || n==1){
//         return n;
//     }

// return fib(n-1)+fib(n-2);
//     }
//     public static void main(String args[]){
// int n=6;
// System.out.println(fib(n));
//     }
// }








//fibo using dp   memoization
public class dp1{
//   memoization
    public static int fib(int  n,int f[]){
    if(n==0 || n==1){      
        return n;
    }

    if(f[n]!=0){// alredy calculated
        return f[n];
    }

f[n]= fib(n-1,f)+fib(n-2,f);
return f[n];
    }

    public static int fibtab(int n){//0(n)
int dp[]=new int[n+1];
dp[0]=0;
dp[1]=1;
for(int i=2;i<=n;i++){
    dp[i]=dp[i-1]+dp[i-2];
}
return dp[n];
    }
    public static void main(String args[]){
int n=6;
int f[]=new int[n+1];//0 store hoti array
// System.out.println(fib(n,f));
System.out.println(fibtab(n));
    }
}