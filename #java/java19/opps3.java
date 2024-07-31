public class opps3 {

  public static void main(String args[]) {
    student s1 = new student();
    student s2 = new student("bhushan");
    student s3 = new student(5);
    // System.out.println(s1.name);
  }
}

class student {

  String name;
  int roll;

  student() {
    System.out.println("constructor ia called...");
  }

  student(String name) {
    this.name = name;
  }
student(int roll){
    this.roll=roll;
}

}
