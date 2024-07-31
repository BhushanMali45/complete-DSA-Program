//linear search

// public class array4{


//     public static int linearsearch(int numbers[], int key){


// for(int i=0;i<=numbers.length;i++){
//     if(numbers[i]==key){
//         return i;
//     }    
// }
// return -1;
//     }

//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10,12,14,16,18};
//         int key=10;


//         int index =linearsearch(numbers,key);

//         if(index== -1){
//            System.out.println("keys not found"); 
//         }else{
// System.out.println("key found"+index);
//         }

        
//     }
// }






public class array4{

public static int linearsearch(String menu[],String key){
   for(int i=0;i<=menu.length;i++){
    if(menu[i]==key){
        return i;
    }
   }
   return -1;
}
   

    public static void main(String args[]){
       String menu[]={"samosa","kachro","vadapav"};
       String key="samosa";



int index =linearsearch(menu,key);

        if(index== -1){
           System.out.println("keys not found"); 
        }else{
System.out.println("key found"+index);
        }

       

        
    }
}