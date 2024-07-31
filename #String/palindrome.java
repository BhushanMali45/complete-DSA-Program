public class palindrome {


    public static boolean ispalindrome(String str){
for(int i=0;i<str.length()/2;i++){
    if(str.charAt(i)==str.charAt(str.length()-1-i)){//
        return  true;
       
    }
   
}
return false;
    }

    
    public static void main(String args[]){
      String  str1 =  "ABCDCBA";
      String str2="TAKE U FORWARD";
    //   System.out.print(ispalindrome(str1));
    //   System.out.println();
    //   System.out.print(ispalindrome(str2));

    boolean ans=ispalindrome(str2 );
  
    if(ans==true){
        System.out.println("Palindrome");

    }
    else{
        System.out.println(" not Palindrome");
    }
    
    }
}






// import java.util.Scanner;

// public class palindrome {


//     public static boolean ispalindrome(String str){
// for(int i=0;i<str.length()/2;i++){
//     if(str.charAt(i)==str.charAt(str.length()-1-i)){//
//         return  true;
       
//     }
   
// }
// return false;
//     }

    
//     public static void main(String args[]){
//      Scanner sc=new Scanner (System.in);
//      String str=sc.next();
//     //   System.out.print(ispalindrome(str1));
//     //   System.out.println();
//     //   System.out.print(ispalindrome(str2));

//     boolean ans=ispalindrome(str);
  
//     if(ans==true){
//         System.out.println("Palindrome");

//     }
//     else{
//         System.out.println(" not Palindrome");
//     }
    
//     }
// }
