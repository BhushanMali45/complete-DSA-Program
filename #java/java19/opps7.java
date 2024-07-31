public class opps7 {

  public static void main(String args[]) {
    dog dobby = new dog();
    dobby.eats();
    dobby.legs = 4;
    System.out.println(dobby.legs);
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

  int legs;
}

class dog extends mammal {

  String breed;
}
