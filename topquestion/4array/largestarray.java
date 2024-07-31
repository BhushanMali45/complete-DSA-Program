public class largestarray {


    public static int largestarray(int numbers[]){
        int largest=Integer.MIN_VALUE;
       for(int i=0;i<numbers.length;i++){
        if(largest <numbers[i]){
            largest=numbers[i];
        }
       }
       return largest;
    }
    public static void main(String args[]){
        int numbers[]={1,2,4,5,6,0};

        int ans=largestarray(numbers);
        System.out.println(ans);


    }
}
