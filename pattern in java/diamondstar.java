
// combine pyramid and invetred pyramid

public class diamondstar{
    public static void pattern(int rows){
        for(int i=1;i<=rows;i++){
            //space
            for(int space=1;space <=rows-i; space++){
                System.out.print(" ");

            }

            for(int j=1;j<=2*i-1;j++){//
                System.out.print("*");

            }
            System.out.println();
    }











            // invetred

            for(int k=rows-1;k>=1;k--){
                //space
                for(int space=1;space <=rows-k; space++){
                    System.out.print(" ");
    
                }
    
                for(int j=1;j<=2*k-1;j++){//
                    System.out.print("*");
    
                }
                System.out.println();
            }

        }

    
    public static void main(String args[]){

        pattern(5);
    }
}