public class string1{
//check palindrome or not 

public static  boolean ispalindrome(String str){
    for(int i=0;i<str.length()/2; i++){
        int n= str.length();

        if(str.charAt(i)!= str.charAt(n-1-i)){
            //palindrome nahi aahe
            return false;
        }
    }
    return true;
}

    public static void main(String args[]){

        String str="madam";
    System.out.println(ispalindrome(str));
    }
}