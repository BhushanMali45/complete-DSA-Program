public class binomialcoefficient {


    public static int fac(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }



    public static int binomialcoefficient(int n,int r){
        int nfac=fac(n);
        int rfac=fac(r);
        int n_rfac=fac(n-r);

        int ans= nfac/(rfac*n_rfac);
        return ans;
    }
    public static void main(String args[]){
        int ans=binomialcoefficient(4, 2);
        System.out.print(ans);
    }
}
