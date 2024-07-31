public class opps9{

    public static void main(String args[])
{
calculator calc=new calculator();

System.out.println(calc.sum(1,2));

System.out.println(calc.sum((float)1.2,(float)2.3));

System.out.println(calc.sum(1,2,5));



}
}

class calculator{
    int sum(int a, int b){
        return a+b;
    }


    float sum(float a,float b){
        return a+b;

    }

    int sum(int a, int b, int c){
        return a+b+c;
    }


}