public class search {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;

        }
        //kaam
        int mid=si+(ei-si)/2;

        //case founf
        if(arr[mid]==tar){
            return mid;
        }

        //mid on line 1
        if(arr[si]<=arr[mid]){
            //case a:left

            if(arr[si] <= tar  && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }

            //case bright
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
         //mid on 2 line
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }

            //case bright
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }


    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        int targetindex=search(arr, target,0,arr.length);
        System.out.println(targetindex);
    }
}
