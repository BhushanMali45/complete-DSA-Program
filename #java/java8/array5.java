public class array5{

public static int getlargest(int numbers[]){
    int largest= Integer.MIN_VALUE;
    
    for(int i=0;i<numbers.length;i++){
        if(largest < numbers[i]){
            largest=numbers[i];
        }
    }
    return largest;
}

    public static void main(String args[]){
        int numbers[]= { 1, 2, 4, 6, 3 };

       System.out.println("largest no is:"+getlargest(numbers));

    }
}