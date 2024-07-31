public class loop5{
    public static void main(String args[])
{
int  n = 10502;

while(n>0){
    int lastdigit = n%10;
    System.out.print(lastdigit);

    n=n/10;
}
System.out.println();
}
}