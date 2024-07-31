public class quick {


public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}


public static void quicksort(int arr[],int si,int ei){

    if(si>=ei){
        return;
    }


  int pidx=partition(arr,si,ei);//last element
  quicksort(arr, si, pidx-1);//left
  quicksort(arr, pidx+1, ei);//right
}

public static int partition(int arr[],int si,int ei){


    int pivot=arr[ei];
    int i=si-1;// to make the place snaller than pivot
   for(int j=si;j<=ei;j++){
    if(arr[j]<pivot){
        i++;
        //swap
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
   }
  i++;
        //swap
        int temp=pivot;
        arr[ei]=arr[i];//not pivot=arr[i]  index par change karna
        arr[i]=temp;
        return i;


}






    public static void main(String args[]){
        int arr[]={6,3,8,2,9,5};
        quicksort(arr, 0,arr.length-1);
        printarr(arr);
    }
}
