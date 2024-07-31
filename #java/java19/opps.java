public class opps {
  public static void main(String args[]){
     //object
     Pen p1=new Pen();//created a pen objects called as p1
     p1.setColor("blue");
     System.out.println(p1.color);

     p1.setTip(5);
     System.out.println(p1.tip);

     p1.setColor("red");
     p1.color="parpale";
     System.out.println(p1.color);


     Bankaccount myaccount=new Bankaccount();
     myaccount.username="bhushan";
    //  myaccount.Password="abcd";//error
    myaccount.setpassword("abcd");
 
    }  
}
class Pen{
    //proerty+function
    String color;
    int tip;

    void setColor(String newcolor){
        color=newcolor;
    }

    void setTip(int newtip){
        tip=newtip;
    }

}

    //create class student
    class student{
        String name;
        int age;
        float percentage;

        void calcpercentage(int phy, int che ,int math){
            percentage=(phy+che+math)/3;
        }

    }


    class Bankaccount{
       public  String username;
       private String Password; 


       public void setpassword(String pwd){
        Password=pwd;
       }
    }
