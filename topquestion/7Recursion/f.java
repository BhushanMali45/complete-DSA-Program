// public class f {
//     //check the array is sorted or not

//     public static boolean issorted(int arr[]){

//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 return false;
//             }
//         }
//         return true;

//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//        System.out.print( issorted(arr));

//     }
// }












public class f {
    //check the array is sorted or not

    public static boolean issorted(int arr[],int i){

       if(i==arr.length-1){
        return true;
       }

       if(arr[i]>arr[i+1]){
        return false;
       }

      return  issorted(arr, i+1);

    }
    public static void main(String args[]){
        int arr[]={1,2,9,4,5};
       System.out.print( issorted(arr,0));

    }
}
