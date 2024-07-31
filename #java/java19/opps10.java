public class opps10 {
   
    

    public static void main(String args[]){


        deer d=new deer();
      d.eat();
    
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class deer{
    void eat(){
        System.out.println("eats grass");
    } 
}
