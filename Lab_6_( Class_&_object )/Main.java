class Student {
  String name;
  int age;
  String department;

  Student() {
    name = "Unknown";
    age = 20;
    department = "Unassigned";
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
    this.department = "IT";
  }

  Student(String name, int age, String department) {
    this.name = name;
    this.age = age;
    this.department = department;
  }

  void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {

    Student s1 = new Student();

    Student s2 = new Student("Suraj", 21);

    Student s3 = new Student("Mayur", 20, "Computer Science");

    System.out.println("Student 1:");
    s1.printDetails();

    System.out.println("Student 2:");
    s2.printDetails();

    System.out.println("Student 3:");
    s3.printDetails();
  }
}
