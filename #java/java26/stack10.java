import java.util.*;
public class stack10{


    public static boolean isduplicate(String str){
      Stack<Character>s=new Stack<>();
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        //2   closing
         if(ch==')'){

            int count=0;
            while(s.peek() != '('){
               s.pop();
               count++;
            }

            if(count<1){
               return true;//duplicate 
            }else{
                s.pop();//openon pair ko pop kiya
            }
         }else{
 ///1    openong ,oprator ,operands
          s.push(ch);
         }
      }
      return false;
    }

    public static void main(String args[]){
        String str= "((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(isduplicate(str));
    }
}
