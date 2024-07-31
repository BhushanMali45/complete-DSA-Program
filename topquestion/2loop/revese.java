// public class revese {
//   ///print reverse of number
//     public static void main(String args[]){
//         int n=4545;
//         while(n>0){  //!=chalel
//             int lastdigit=n %10;
//             System.out.print(lastdigit);
//             n=n/10;

//         }
//         System.out.println();
//     }
// }






public class revese {
  ///print reverse of number
    public static void main(String args[]){
        int n=4545;
        for(;n!=0;){
            int lastdigit=n %10;
            System.out.print(lastdigit);
            n=n/10;

        }
        System.out.println();
    }
}
