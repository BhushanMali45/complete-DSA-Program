public class recursion8 {
    
    public static int tilingpromblem(int n){
        //base case 
        if(n==0 || n==1){
            return  1;
        }

        //vertical choice
        int fnm1= tilingpromblem(n-1);
        //horizontal choice
        int fnm2= tilingpromblem(n-2);

        int totalways=fnm1 +fnm2;
        return totalways;

    }


    public static int friendpairing(int n){
        if(n==1 ||n==2){
            return n;
        }

        // //choice
        // //single
        // int fnm1=friendpairing(n-1);

        // //pair
        // int fnm2=friendpairing(n-2);
        // int pairways=(n-1)*fnm2;

        // int totalways=fnm1+pairways;
        // return totalways;

        return friendpairing(n-1)+(n-1)*friendpairing(n-2);
    }    

public static void main(String args[]){
System.out.println(tilingpromblem(3));
System.out.println(friendpairing(3));


}




}
