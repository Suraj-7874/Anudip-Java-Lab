import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoCity {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    List<String> city=new ArrayList<>();
    System.out.print("Enter the numebr of cities :-");
    int n =sc.nextInt();
    sc.nextLine();
    for(int i = 0 ;i < n;i++)
    {
      System.out.print("Enter city ["+(i+1)+"]  name = ");
      city.add(sc.nextLine());
    }
    System.out.println(city);
    TreeSet sorted = new TreeSet<>(city);
    System.out.println(sorted);
  }

}
