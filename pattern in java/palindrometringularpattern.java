//fullpyramid

// public class palindrometringularpattern{
//     public static void pattern(int rows){
//         for(int i=1;i<=rows;i++){
//             //space
//             for(int space=1;space <=rows-i; space++){
//                 System.out.print(" ");

//             }

//             for(int j=1;j<=2*i-1;j++){//
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){

//         pattern(5);
//     }
// }







// ******* Inverted
// public class palindrometringularpattern{
//     public static void pattern(int rows){
//         for(int i=rows;i>=1;i--){
//             //space
//             for(int space=1;space <=rows-i; space++){
//                 System.out.print(" ");

//             }

//             for(int j=1;j<=2*i-1;j++){//
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){

//         pattern(5);
//     }
// }





public class palindrometringularpattern{
    public static void pattern(int rows){
        for(int i=1;i<=rows;i++){
            //space
            for(int space=1;space <=rows-i; space++){
                System.out.print(" ");

            }

            for(int j=1;j<=2*i-1;j++){//
                System.out.print(j);

            }
            System.out.println();
        }

    }
    public static void main(String args[]){

        pattern(5);
    }
}
