
import java.util.*;
public class tax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pen=sc.nextInt();
        int pencil=sc.nextInt();
        int total=pen +pencil;


        //tax
        float tax=total+(0.18f*total);
        System.out.println(tax);

    }
}