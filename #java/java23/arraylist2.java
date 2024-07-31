import java.util.ArrayList;

public class arraylist2 {

  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(9);
    list.add(1);
    list.add(45);

    System.out.println(list.size());

    //print arraylist
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();


//reverse list
for(int i=list.size()-1;i>=0;i--){
    System.out.print(list.get(i)+" ");

}
System.out.println();


//find the maximum in array list
int max=Integer.MIN_VALUE;
for(int i=0;i<list.size();i++){
    // if(max<list.get(i)){
    //   max=list.get(i);  
    // }

    max=Math.max(max, list.get(i));
}
System.out.println("max element = "+ max);

  }
}
