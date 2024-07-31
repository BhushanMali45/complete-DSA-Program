import java.util.Scanner;

public class area {
  public static void main(String args[])  {
    Scanner sc=new Scanner(System.in);
    float rad=sc.nextFloat();
    float area=3.142f * rad *rad;
    System.out.println(area);
  }
}
