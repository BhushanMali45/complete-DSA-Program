// public class array12{


// public static void kadanes_algorithm(int numbers[]){

// int maxsum= Integer.MIN_VALUE;
// int currsum=0;

// for(int i=0;i<numbers.length;i++){
//     currsum=currsum+numbers[i];

//     if(currsum < 0){
//         currsum=0;
//     }else
//     maxsum=Math.max(currsum,maxsum);
// }
// System.out.println("max of sub array is "+maxsum);

// }
//     public static void main(String args[]){
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};

//         kadanes_algorithm(numbers);
//     }
// }








public class array12{


public static void kadanes_algorithm(int numbers[]){

int maxsum= Integer.MIN_VALUE;
int currsum=0;



for(int j=0;j<=numbers.length;j++){
    
if(numbers[i]<0){
    currsum=-1;
}else{
for(int i=0;i<numbers.length;i++){
    currsum=currsum+numbers[i];

    if(currsum < 0){
        currsum=0;
    }else
    maxsum=Math.max(currsum,maxsum);
}

System.out.println("max of sub array is "+maxsum);
}



}

}
    public static void main(String args[]){
        // int numbers[]={-2,-3,4,-1,-2,1,5,-3};
         int numbers[]={-2,-3,-3};

        kadanes_algorithm(numbers);
    }
}