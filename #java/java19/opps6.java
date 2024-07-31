

public class opps6 {
    public static void main(String args[]){
fish shark=new fish();
shark.eats();
    }
}
//base class
class animals{
    String color;
    void eats(){
        System.out.println("eats");
    }


    void breathe(){
        System.out.println("braethe");
    }
}

//derived class 
class fish extends animals{
    int fins;
    void swim(){
        System.out.println("swim in water");  
    }
}
