import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    Student student1 = new Student();
    Student student2 = new Student();

    //student1.setName("Arnold Spielberg");
    //student1.setGPA(4.0);
    //student1.setMajor("Electrical Engineering");

    // or can do this with the dot operator
    student1.name = "Arnold Spielberg";
    student1.gpa = 4.0;
    student1.major = "Electrical Engineering";

    student2.name = "Calvin Catania";
    student2.gpa = 4.3;
    student2.major = "Information Systems and Operations Management";  

    student1.print();
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(0, student1.gpa);
    gpas.add(1, student2.gpa);

    double sum = 0;
      for (int number = 0; number < gpas.size(); number++)
        sum += gpas.get(number);

    double average = sum / gpas.size();
    System.out.println("The average GPA is " + average);

    /* System.out.println("student1's name is " + student1.getName() + " and their GPA is " + student1.getGPA()
       + " and their major is " + student1.getMajor()); */

    // or can do this with the dot operator
    // System.out.println("student1's name is " + student1.name + " and their GPA is
    // " + student1.gpa + " and their major is " + student1.major);
  }
}

class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

  void print() {
    System.out.println("The Student's name is " + name); 
    System.out.println("The Student's gpa is " + gpa);
    System.out.println("The Student's major is " + major);
  }

}