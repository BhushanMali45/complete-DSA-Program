public class getith {

    public static int getithbit(int n,int i){
        int bitmask=1<<i;
    
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }}



    //setith bit
    public static int setith(int n,int i)
{
    int bitmask=1<<i;
  return   n|bitmask;
} 

public static void main(String args[]){
       System.out.println( getithbit(10, 3));

              System.out.println(setith(8, 2));

    }
}
