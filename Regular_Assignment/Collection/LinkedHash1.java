import java.util.*;

public class LinkedHash1
{
    public static void main(String args[])
    {
        LinkedHashSet<String> lp =new LinkedHashSet<>();
        lp.add("math");
        lp.add("science");
        lp.add("bio");
        lp.add("chemistry");

        Iterator<String> itr = lp.iterator(); 

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        

    }
}