public class swpa {
    public static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
          System.out.println(a);
            System.out.println(b);
    }
    public static void main(String args[]){
        int a=5;
        int b=10;

       swap(a, b);
        
    }
}
