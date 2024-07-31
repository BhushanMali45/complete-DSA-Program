public class opps15 {

  public static void main(String args[]) {
    student s1 = new student();
    s1.SchoolName = "ssbt";

    student s2 = new student();
    System.out.println(s2.SchoolName);

    student s3 = new student();
    s3.SchoolName = "ABC";
    // System.out.println(s3.SchoolName);
  }
}

class student {

  //static function
  // static int percentage(int phy, int maths,int che){
  //     return (maths+phy+che)/3;
  // }
  String name;
  int roll;

  static String SchoolName;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return this.name;
  }
}
