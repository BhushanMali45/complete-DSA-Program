// public class triangularstarpattern {
//     public static void pattern(int rows){
//         for(int i=1;i<=rows;i++){
//             for(int space=1;space <=rows-i;space++){
//               System.out.print(" ");


              
//             }
              
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");//star and space
//             }

//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         pattern(5);
//     }
// }






// **********inveted Trinagular pattern
// public class triangularstarpattern {
//     public static void pattern(int rows){
//         for(int i=rows;i>=1;i--){
//             for(int space=1;space <=rows-i;space++){
//               System.out.print(" ");


              
//             }
              
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");//star and space
//             }

//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         pattern(5);
//     }
// }








// numbervale

public class triangularstarpattern {
    public static void pattern(int rows){
        for(int i=1;i<=rows;i++){
            for(int space=1;space <=rows-i;space++){
              System.out.print(" ");


              
            }
              
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");//star and space
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(6);
    }
}

