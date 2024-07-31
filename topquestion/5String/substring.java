// public class substring {


//     public static String substring(String str,int si,int ei){
//         String substr=" ";
//         for(int i=si;i<ei;i++){
//             substr +=str.charAt(i);
//         }
//         return substr;
//     }
 
   

//     public static void main(String args[]){
//         String  str="hello world";
//         // System.out.println(substring(str, 0, 5));
//         System.out.println(str.substring(0, 7));


//     }
// }



public class substring {


    public static String substring(String str,int si,int ei){
    StringBuilder sb=new StringBuilder(" ");
        for(int i=si;i<ei;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
 
   

    public static void main(String args[]){
        String  str="hello world";
        System.out.println(substring(str, 0, 3));
        // System.out.println(str.substring(0, 7));


    }
}
