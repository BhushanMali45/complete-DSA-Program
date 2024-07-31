import java.util.Scanner;

public class a{




    public static void printarr(char arr[]){
         for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
   } 
    }



    
public static void main(String args[]){
    char arr[]={'a','b','c'};
    printarr(arr);
    System.out.println();

    String str="abc";
    String str2=new String ("abc");
        System.out.print(str);
        System.out.print(str.length());


        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // System.out.print(name);



        String firstname= "Bhushan";
        String lastname="Mali";
        String fullname=firstname+ " "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.charAt(0));




  

}
}