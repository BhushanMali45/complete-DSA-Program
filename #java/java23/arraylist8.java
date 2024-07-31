import java.util.ArrayList;

public class arraylist8 {
    
// //brute force 
// public static boolean pairsum1(ArrayList<Integer>list, int target){

// for(int i=0;i<list.size();i++){
//     for(int j=i+1;j<list.size();j++){
//        if(list.get(i)+list.get(j)==target) {
//         return true;
//        }
//     }
// }
// return false;
// }
///


//optimize o(n)
//2pointer approach

public static boolean pairsum1(ArrayList<Integer>list,int target){
int lp=0;
int rp=list.size()-1;

while(lp!=rp){//lp<rp
//case1
if(list.get(lp)+list.get(rp)==target){
    return true;
}
//case 2
if(list.get(lp)+list.get(rp)<target){
    lp++;
}


//case3
else{
    rp--;
}
}

return false;    
}



    public static void main(String args[]){
ArrayList<Integer>list=new ArrayList<>();
//1 , 2 3 4 5 6
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);

int target=5;
System.out.println(pairsum1(list, target));
    }
}

