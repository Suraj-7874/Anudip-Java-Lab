import java.util.*;

public class LinkedList1
{
    public static void main(String[] args)
    {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("Suraj");
        ls.add("Mayur");
        ls.add("Pankaj");
        ls.add("Pram");
        ls.add("Prain");

        Iterator<String> itr = ls.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}