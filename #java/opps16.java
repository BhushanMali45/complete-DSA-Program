public class opps16{
    public static void main(String args[]){
Horse h =new Horse();

    }
}

class Animals{
    Animals(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animals{
    Horse(){
        super();
        System.out.println("horse constructor is called");

    }
}