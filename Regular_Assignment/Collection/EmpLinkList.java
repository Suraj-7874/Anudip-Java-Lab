import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmpLinkList {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of Employee = ");
    int n =sc.nextInt();
    sc.nextLine();
    LinkedList<String> emp = new LinkedList<>();
    for(int i = 0; i < n ; i++)
    {
      System.out.print("Enter the ["+(i+1)+"] name =");
      emp.add(sc.nextLine());
    }
    Iterator itr = emp.iterator();
    ListIterator itr1 = emp.listIterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
    System.out.println("Reverse order :- ");
     while(itr1.hasNext())
    {
     itr1.next();
    }
    while(itr1.hasPrevious())
    {
      System.out.println(itr1.previous());
    }
  }
  
}
