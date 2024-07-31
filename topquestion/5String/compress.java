// public class compress {

//     public static String compress(String str){
//         String newstr="";
// //aabb
//         for(int i=0;i<str.length();i++){

//             Integer count=1;
//             while(  i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;

//             }


//             //append

//             newstr +=str.charAt(i);

//             if(count > 1){
//                 newstr +=count.toString();
//             }
//         }
//         return newstr;
//     }
//     public static void main(String args[]){

//         String  str="aaaccccdd";

//         System.out.println(compress(str));
         
//     }
// }






//string builder


// public class compress {

//     public static String compress(String str){
//         StringBuilder sb=new StringBuilder(" ");

//         for(int i=0;i<str.length();i++){

//             Integer count=1;
//             while(  i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 count++;
//                 i++;

//             }


//             //append

//             sb.append(str.charAt(i));

//             if(count > 0){
               
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){

//         String  str="aaaccccdd";

//         System.out.println(compress(str));
         
//     }
// }
















public class compress {

    public static String compress(String str) {
        StringBuilder sb= new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                  sb.append(count);
                }
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaccccdd";
        System.out.println(compress(str));
    }
}
