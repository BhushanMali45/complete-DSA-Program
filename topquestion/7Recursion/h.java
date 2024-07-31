
public class h {
    //find the last occurence in array
    public static int lastoccurence(int arr[],int key,int i){
       
        if(i==arr.length-1){
            return -1;

        }

//look forward
        int isfound=lastoccurence(arr, key, i+1);

        if(isfound!=-1){
            return isfound;
        }

        //compare with self
        if(arr[i]==key){
            return i;
        }

        return isfound;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,8,6,5,4};
        System.out.println(lastoccurence(arr, 5, 0));

    }
}

