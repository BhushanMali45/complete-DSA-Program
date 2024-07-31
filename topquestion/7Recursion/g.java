
public class g {
    //find the first occurence in array
    public static int firstoccurence(int arr[],int key){
         
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
           }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,8,6,5,4};
       int ans= firstoccurence(arr, 5);
       System.out.println(ans);
       

    }
}





// public class g {
//     //find the first occurence in array
//     public static int firstoccurence(int arr[],int key,int i){

//         if(i==arr.length-1){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//        return  firstoccurence(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[]={1,2,4,5,8,6,5,4};
//         System.out.println(firstoccurence(arr, 5, 0));

//     }
// }
