import java.util.*;
public class stack8{
  public static void main(String args[]){
    int arr[]={6,8,0,1,3};
    Stack<Integer> s=new Stack<>();
    int nextGreater[]=new int [arr.length];

    for(int i=arr.length-1;i>=0;i--){
        //1while loop
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
           s.pop(); 
        }

        //2 if-else
        if(s.isEmpty()){
               nextGreater[i]=-1;
        }else{
            nextGreater[i]=arr[s.peek()];
        }
        //3 push in the stack

        s.push(i);
    }

for(int i=0;i<nextGreater.length;i++){
    System.out.print(nextGreater[i]+" ");
}
System.out.println();


  }
}













// ///next greater left
// import java.util.*;
// public class stack8{
//   public static void main(String args[]){
//     int arr[]={6,8,0,1,3};
//     Stack<Integer> s=new Stack<>();
//     int nextGreater[]=new int [arr.length];

//     for(int i=0;i<arr.length;i++){///changes here loop
//         //1while loop
//         while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//            s.pop(); 
//         }

//         //2 if-else
//         if(s.isEmpty()){
//                nextGreater[i]=-1;
//         }else{
//             nextGreater[i]=arr[s.peek()];
//         }
//         //3 push in the stack

//         s.push(i);
//     }

// for(int i=0;i<nextGreater.length;i++){
//     System.out.print(nextGreater[i]+" ");
// }
// System.out.println();


//   }
// }




// ///next smaller right
// import java.util.*;
// public class stack8{
//   public static void main(String args[]){
//     int arr[]={6,8,0,1,3};
//     Stack<Integer> s=new Stack<>();
//     int nextGreater[]=new int [arr.length];

//     for(int i=arr.length-1;i>=0;i--){
//         //1while loop
//         while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
//            s.pop(); 
//         }

//         //2 if-else
//         if(s.isEmpty()){
//                nextGreater[i]=-1;
//         }else{
//             nextGreater[i]=arr[s.peek()];
//         }
//         //3 push in the stack

//         s.push(i);
//     }

// for(int i=0;i<nextGreater.length;i++){
//     System.out.print(nextGreater[i]+" ");
// }
// System.out.println();


//   }
// }





// //next smaller left
// import java.util.*;
// public class stack8{
//   public static void main(String args[]){
//     int arr[]={6,8,0,1,3};
//     Stack<Integer> s=new Stack<>();
//     int nextGreater[]=new int [arr.length];

//     for(int i=0;i<arr.length;i++){
//         //1while loop
//         while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
//            s.pop(); 
//         }

//         //2 if-else
//         if(s.isEmpty()){
//                nextGreater[i]=-1;
//         }else{
//             nextGreater[i]=arr[s.peek()];
//         }
//         //3 push in the stack

//         s.push(i);
//     }

// for(int i=0;i<nextGreater.length;i++){
//     System.out.print(nextGreater[i]+" ");
// }
// System.out.println();


//   }
// }