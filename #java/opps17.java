// public class opps17{
//     public static void main(String args[]){
// Horse h =new Horse();

//     }
// }

// class Animals{
//     Animals(){
//         System.out.println("animal constructor is called");
//     }
// }

// class Horse extends Animals{
//     Horse(){
//         super();
//         System.out.println("horse constructor is called");

//     }
// }















public class opps17{
    public static void main(String args[]){
Horse h =new Horse();
System.out.println(h.color);

    }
}

class Animals{
    String color;
    Animals(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animals{
    Horse(){
        super.color="pink";
        System.out.println("horse constructor is called");

    }
}





