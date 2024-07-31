public class opps11 {

  public static void main(String args[]) {
    Horse h = new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);

    chicken C = new chicken();
    C.eat();
    C.walk();
  }
}

abstract class Animal {

  String color;

  Animal() {
    color = "brown";
  }

  //non abstract function
  void eat() {
    System.out.println("aniamlsn eats");
  }

  abstract void walk(); //abstract aahe karan implementation nahiahhae
}

class Horse extends Animal {

  void changecolor() {
    color = "dark-brown";
  }

  void walk() {
    System.out.println("walks on 4 legs");
  }
}

class chicken extends Animal {

  void changecolor() {
    color = "pink";
  }

  void walk() {
    System.out.println("walks on 2 legs");
  }
}
