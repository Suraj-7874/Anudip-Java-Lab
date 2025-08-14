import java.util.*;

public class Search {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of student :- ");
    int n =sc.nextInt();
    sc.nextLine();

    Hashtable<String,Float> ht=new Hashtable<>();
    
    for(int i = 0 ;i < n ;i++)
    {
      System.out.print("Enter the ["+(i+1)+"] student name = ");
      String name=sc.nextLine();
      System.out.print("Enter the ["+(i+1)+"] student Percentage = ");
      Float percentage = sc.nextFloat();
      sc.nextLine();
      ht.put(name,percentage);

    }
    Enumeration studentName=ht.keys();
    System.out.println("student Name :-");
    while(studentName.hasMoreElements())
    {
      System.out.println(studentName.nextElement());
    }
    Enumeration studentPercentage=ht.elements();
    System.out.println("Stuedent Percentage :- ");
    while(studentPercentage.hasMoreElements())
    {
      System.out.println(studentPercentage.nextElement());
    }
    System.out.print("Eneter the name to serach :- ");
    String sh= sc.nextLine();
    if(ht.containsKey(sh))
    {
      System.out.println("Record found and Percentage is  :- ");
      System.out.println(ht.get(sh));
    }
    else
    {
      System.out.println("Record not found ");
    }
    sc.close();
  }
  
}
