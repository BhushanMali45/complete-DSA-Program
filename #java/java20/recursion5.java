public class recursion5{


// public static int firstoccurance(int arr[],int key,int i){
//     if(i==arr.length){
//         return -1;
//     }
    
    
//     if(arr[i]==key){
//         return i;
//     }

//     return firstoccurance(arr, key, i+1);
// }



//lastoccurence


public static int lastoccurence(int arr[],int key,int i){
    if(i==arr.length){
        return -1;
    }
    int isFound =lastoccurence(arr, key, i+1);
    if(isFound == -1  && arr[i]==key){
        return i;
    }
    return isFound;
    
}

    public static void main(String args[]){
int arr[]={8,3,6,9,5,10,2,5,3};
// System.out.println(firstoccurance(arr, 5, 0));
 System.out.println(lastoccurence(arr, 5, 0));
    }
}
