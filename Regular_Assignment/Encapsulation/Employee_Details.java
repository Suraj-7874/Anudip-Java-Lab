public class Employee_Details extends Employee {
  int id;

  public void Accept() {
    System.out.println("-----------------------------------------------------------------");
    System.out.print("\nEnter the Empolyee Id :- ");
    id = sc.nextInt();
    sc.nextLine();

    if (id == getEmp_Id()) {
      System.out.print("\nWelcome , " + getEmp_Name());
      Display();
    } else {
      System.out.print("Enter the name :- ");
      String name = sc.nextLine();

      setEmp_Name(name);
      setEmp_Id(id);
      Display();

    }
  }

  public void Display() {
    System.out.println("\nEmpolyee Details :- ");
    System.out.println("---------------------------------------------------");
    System.out.println("Empolyee Name :- " + getEmp_Name());
    System.out.println("Empolyee Id :- " + getEmp_Id());
    System.out.println("Empolyee Salary :- " + getEmp_Salary());
     System.out.println("---------------------------------------------------");
     
  }

  public static void main(String[] args) {
    Employee_Details emp = new Employee_Details();
    emp.Accept();
  }
}
