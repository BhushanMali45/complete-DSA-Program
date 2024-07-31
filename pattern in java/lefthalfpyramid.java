// public class lefthalfpyramid {
//     public static void pattern(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){//
//                  int sum=i+j;
//                 if(sum <=n){ ///
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }

//             }
//             System.out.println();
//         }
//     }
//         public static void main(String args[]){
// pattern(6);
//     }
// }











// reverse right half pyramid 
public class lefthalfpyramid {
    public static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){//
                 int sum=i+j;
                if(sum <=n){ ///
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
        public static void main(String args[]){
pattern(6);
    }
}

