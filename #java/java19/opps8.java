public class opps8{

    public static void main(String args[]) {
     bird b1=new bird();
     b1.eats();

    }
  }
  
  //base class
  class animals {
  
    String color;
  
    void eats() {
      System.out.println("eats");
    }
  
    void breathe() {
      System.out.println("braethe");
    }
  }
  
  //derived class
  class mammal extends animals {
  void walk(){
    System.out.println("walk");
  }
    
  }



    //derived class
    class fish extends animals {
        void swim(){
          System.out.println("swim");
        }
          
        }


          //derived class
  class bird extends animals {
    void fly(){
      System.out.println("fly");
    }
      
    }





 
  