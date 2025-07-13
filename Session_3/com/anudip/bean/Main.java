package  com.anudip.bean;

public class Main 
{
    public static void main(String[] args) 
    {
       
        Student stu = new Student("Suraj", 21, "Computer Science");

      
        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Department: " + stu.getDepartment());

       
        stu.setName("Pravin");
        stu.setAge(22);
        stu.setDepartment("Information Technology");

        System.out.println("Updated Name: " + stu.getName());
        System.out.println("Updated Age: " + stu.getAge());
        System.out.println("Updated Department: " + stu.getDepartment());
    }
}
