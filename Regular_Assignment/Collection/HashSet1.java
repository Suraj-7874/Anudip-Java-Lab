import java.util.HashSet;

public class HashSet1{
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>(5,0.5f);
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
        System.out.println("four");

        System.out.println(hs);

        Boolean b =hs.add("one");
        System.out.println("Duplicate item allowed =" + b);
        System.out.println(hs);
    }
}