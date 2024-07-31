public class opps12 {

    public static void main(String args[]) {

  Mustang myhorse =new Mustang();
  //animal -->horse-->mustang
  

    }
  }
  
  abstract class Animal {
  
    String color;
    //constructor
  Animal (){
System.out.println("animals constructor called");
  }


 
    void eat() {
      System.out.println("aniamlsn eats");
    }
  
    abstract void walk(); //abstract aahe karan implementation nahiahhae
  }
  
  class Horse extends Animal {
  Horse(){
    System.out.println("Horse constructor called");

  }
     
    void walk() {
      System.out.println("walks on 4 legs");
    }
  }



  class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    
      }
  }







  