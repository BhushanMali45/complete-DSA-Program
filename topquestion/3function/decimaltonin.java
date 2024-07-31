//dec to binary
public class decimaltonin{


    public static void decTobin(int n){
        int myNum=n;
           int pow=0;
           int binNUm=0;

           while(n>0){  //!=
            int rem=n%2;
            binNUm=binNUm+(rem* (int)Math.pow(10, pow));
            pow++;
            n=n/2;
           }

           System.out.println("binary form of"+myNum+"="+binNUm);
    }
    public static void main(String args[]){
        decTobin(7);
    


}
}