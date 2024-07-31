public class reverse {

    public static void printarray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }


     public static void printarrayreverse(int numbers[]){
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]);
        }
    }














    //////////////
    
    public static void swappingreversearray(int numbers[]){
        int start=0,end=numbers.length-1;

        while(start<end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    }
    public  static void main(String args[]){
         int numbers[]={1,2,3,4,5,6};
// printarray(numbers);
// printarrayreverse(numbers);

swappingreversearray(numbers);
 for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
}
