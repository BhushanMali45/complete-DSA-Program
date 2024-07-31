public class opps1 {
    public static void main(String args[]){
       //object
       Pen p1=new Pen();//created a pen objects called as p1
       p1.setColor("blue");
       System.out.println(p1.getcolor());
  
       p1.setTip(6);
       System.out.println(p1.getTip());
  
       p1.setColor("red");
       p1.setColor("parpale");
       System.out.println(p1.getcolor());
  
  
   
      }  
  }
  class Pen{
      //proerty+function
    private  String color;
    private  int tip;
  
//getterrs
String getcolor(){
    return this.color;
}

int getTip(){
    return this.tip;
}

      //settes
      void setColor(String newcolor){
          color=newcolor;
      }
  
    //   void setTip(int newtip){
    //       tip=newtip;
    //   }

    void setTip(int tip){
        this.tip=tip;
    }



  
  }
  
   
  
  
      