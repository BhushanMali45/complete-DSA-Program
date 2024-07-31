public class countwords {

    public static int countword(String str){
        int blankSpaces=1;
       for(int i=0;i<str.length();i++){

        if(str.charAt(i)== ' '){
        blankSpaces +=1;
        }
       }
       return blankSpaces;
    }
    public static void main(String args[]){
String str="Hi there";
System.out.println(countword(str));
    }
}








// public class countwords {

//     public static int countword(String str){
//         int blankSpaces=0;
//        for(int i=0;i<str.length();i++){

       
//         blankSpaces +=1;
       
//        }
//        return blankSpaces;
//     }
//     public static void main(String args[]){
// String str="Hi there";
// System.out.println(countword(str));
//     }
// }
