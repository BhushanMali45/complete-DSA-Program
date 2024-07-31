public class opps14 {
 public static void main(String args[]){



Bear b=new Bear();
b.herb();
b.meat();




    }
}



interface Herbivore{
void herb();
}

interface Carnivore{
void meat();
}

class Bear implements Herbivore,Carnivore{
public void herb(){
    System.out.println("eats grass");
}

public void meat(){
    System.out.println("eats meat");
}
}
