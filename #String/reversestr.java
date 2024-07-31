// public class reversestr {

//     public static String reversestr(String str){
//        for(int i=str.length()-1;i>=0;i--){
//         System.out.print(str.charAt(i));
//        }

//        return str;
//     }
//     public static void main(String args[]){
//     String str="hello world";
//     reversestr(str);
//     }
// }








public class reversestr {

    public static String reversestr(String str){

        char arr[]=str.toCharArray();
        int start=0;
        int end=str.length()-1;

       for(;start<end;){

        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

       }

       return new String(arr);
    }
    public static void main(String args[]){
    String str="hello world";
    System.out.print(reversestr(str));
    }
}
