//sum of n natural number
// public class d {
//     public static void sum(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=i;
//         }
// System.out.println(sum);
//     }
//     public static void main(String bhushan[]){
// sum(5);
//     }
// }





public class d {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        // int cal=sum(n-1);
        // int sum=n+cal;
        // return sum;

        return n+sum(n-1);
    }
    public static void main(String bhushan[]){
System.err.println(sum(5));
    }
}
