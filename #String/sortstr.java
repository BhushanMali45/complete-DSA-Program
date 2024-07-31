import java.util.Arrays;

public class sortstr {

    public static String sort(String str){
        char arr[]=str.toCharArray();

        Arrays.sort(arr);
        return new String(arr);
    }
   public static void main(String args[]){
    String str="zxcbg";
    System.out.print(sort(str));
   } 
}
