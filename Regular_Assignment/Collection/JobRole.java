import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class JobRole {
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    Hashtable<String,String> emp =new Hashtable<>();
    emp.put("Aman", "Manager");
    emp.put("Omakar", "supervise");
    emp.put("Sai", "hr");
    emp.put("Ram", "Empolyee");
    emp.put("Shivaji", "Cleaner");
    Enumeration name =emp.keys();
    while(name.hasMoreElements())
    {
      String str =(String) name.nextElement();
      System.out.println("name :- "+ str +", Positon : "+ emp.get(str));
    }
  }
  
}
