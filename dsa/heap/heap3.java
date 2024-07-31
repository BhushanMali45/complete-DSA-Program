import java.util.*;
public class heap3{

    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            //add last index
            arr.add(data);


            //findout the parent index
             int x=arr.size()-1;//child idx
            int parent=(x-2)/2;//parent idx


            while (arr.get(x) < arr.get(parent)){
                  //swap
                  int temp=arr.get(x);
                  arr.set(x,arr.get(parent));
                  arr.set(parent,temp);

             x=parent;
             parent=(x-1)/2;

            }

        }

        public int peek(){
            return arr.get(0);
        }

  
private void heapify(int i){
   int left=2*i+1;
   int right=2*i+2;
   int minidx=i;


   if(left <arr.size() &&   arr.get(minidx) > arr.get(left)){
  minidx=left;
   }


   if(right <arr.size() &&   arr.get(minidx) >= arr.get(right)){
    minidx=right;
   }


   if(minidx !=i){
    //swap
    int temp=arr.get(i);
    arr.set(i,arr.get(minidx));
    arr.set(minidx,temp);


    heapify(minidx);


   }
}





        public int remove(){
            int data=arr.get(0);

            //step 1 swap 1st and last
            int temp=arr.get(0);
            // arr.set(0, arr.size()-1);

               arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);



            //step delte last
            arr.remove(arr.size()-1);

            //step 3 hepify
            heapify(0);
            return data;

        }



        public boolean isEmpty(){
            return arr.size()==0;
        }
    } 

    


public static void main(String args[]){


heap h=new heap();
h.add(3);
h.add(4);
h.add(1);
h.add(5);


while(!h.isEmpty()){
    System.out.println(h.peek());
    h.remove();

}




}
}
