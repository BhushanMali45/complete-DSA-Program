
import java.util.*;
public class bubble{

    public static void buuble(int arr[]){
        for(int i=0;i<arr.length-1;i++){

            int count=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }

            if(count==0){
                break;
            }
        }
    }





    //selection
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                     if(arr[minpos] > arr[j]){//<decrse orders
                        minpos=j;
                     }
            }

            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }



    //insertion sort
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding the correct postion to insrt
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1] =arr[prev];
                prev--;

            }

            //insertion
            arr[prev+1]=curr;
        }
    }

    public static void printaarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


        public static void printaarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        // int arr[]={1,9,3,4,5};
        // buuble(arr);
        // selection(arr);
        // insertion(arr);
        // Arrays.sort(arr);
          Integer arr[]={1,9,3,4,5};
        Arrays.sort(arr,Collections.reverseOrder());
   
        printaarr(arr);
    }
}