public class b {

    public static void printletter(String str)
    {   int count=0;
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
            count++;
        }
               

        System.out.println();
         System.out.print(count);
    }
    public static void main(String args[]){
String str="Bhushan Mali";
printletter(str);
    }
}





//revesre string
// public class b {

//     public static void printletter(String str)
//     {
//         for(int i=str.length()-1;i>=0;i--){
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
// String str="yogita";
// printletter(str);
//     }
// }





///print vowels{

// public class b {

//   public static void printletter(String str) {
//     int count = 0;
//     for (int i = 0; i < str.length(); i++) {
//       if (
//         str.charAt(i) == 'a' ||
//         str.charAt(i) == 'e' ||
//         str.charAt(i) == 'i' ||
//         str.charAt(i) == 'o' ||
//         str.charAt(i) == 'u'
//       ) {
//         System.out.print(str.charAt(i) + " ");
//         count++;
//       }
//     }
//     System.out.println(count);
//   }

//   public static void main(String args[]) {
//     String str = "yogita";
//     printletter(str);
//   }
// }






// public class b {

//   public static void printletter(String str) {
//     int count = 0;
//     for (int i = 0; i < str.length(); i++) {
//       if (
//         str.charAt(i) == 'a' ||
//         str.charAt(i) == 'e' ||
//         str.charAt(i) == 'i' ||
//         str.charAt(i) == 'o' ||
//         str.charAt(i) == 'u'
//       ) {}else{
//         System.out.print(str.charAt(i) + " ");
//         count++;
//       }
//     }
//     System.out.println(count);
//   }

//   public static void main(String args[]) {
//     String str = "yogita";
//     printletter(str);
//   }
// }


