import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Reverse {
  

  public static void main(String[] args) {
    ArrayList no =new ArrayList<>();
    for(int i = 0;i < 3 ; i++)
    {
      no.add(args[i]);
    }
    System.out.println(no);
    Iterator itr=no.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
    }
    Collections.sort(no,Collections.reverseOrder());
    System.out.println("Reverse Order :- ");
     while(itr.hasNext())
    {
      int num=(int)itr.next();
      System.out.println(num);
    }
  }
}