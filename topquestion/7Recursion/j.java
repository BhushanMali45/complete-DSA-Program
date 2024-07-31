public class j {

    public static int tilingpromble(int n){

        if(n==0 ||n==1){
            return 1;
        }
         int fnm1=tilingpromble(n-1);
         int fnm2=tilingpromble(n-2);
         return fnm1+fnm2;
    }
    public static void main(String args[]){
        System.out.println(3);

    }
}
