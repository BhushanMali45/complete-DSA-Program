import java.util.*;


public class stack11 {
    
public static void maxarea(int arr[]){

    int maxarea=0;
    int nsr[]=new int[arr.length];
    int nsl[]=new int [arr.length];
//next smaller right (j)
Stack<Integer>s=new Stack<>();


for(int i=arr.length-1;i>=0;i--){
    //1while loop
    while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
       s.pop(); 
    }

    //2 if-else
    if(s.isEmpty()){
           nsr[i]=arr.length;
    }else{
        nsr[i]=s.peek();////
    }
    //3 push in the stack

    s.push(i);
}






//next smaller lrft (i)
s=new Stack<>();


for(int i=0;i<arr.length;i++){
    //1while loop
    while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
       s.pop(); 
    }

    //2 if-else
    if(s.isEmpty()){
           nsl[i]=-1;
    }else{
        nsl[i]=s.peek();////
    }
    //3 push in the stack

    s.push(i);
}




//current area
//width =j-i-1  //nsr[j]-nsr[i]-1
for(int i=0;i<arr.length;i++){
int height=arr[i];
int width=nsr[i]-nsl[i]-1;
int currentarea=height*width;
maxarea=Math.max(currentarea,maxarea);
}
System.out.println("max area of histrogram ="+maxarea);

}
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};//heights of histogram
        maxarea(arr);
    }
}
