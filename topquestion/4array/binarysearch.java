public class binarysearch {

    public static int  binarysearch(int numbers[],int key){
        int start=0,end=numbers.length-1;

       while(start<=end){
            int mid=(start+end)/2;

            //comaprison
            //found
             if(numbers[mid]==key){
                  return mid;
             }else if(numbers[mid]<key){
                //right
                start=mid+1;
             }else{
                end=mid-1;
             }
    }
    return -1;
    }
   public static void main(String args[]){
    int numbers[]={2,4,6,8,10,12};
    int key=10;
    int ans=binarysearch(numbers, key);
System.out.println(ans);
   } 
}
