import java.util.Set;
import java.util.TreeSet;

public class Tree
{
    public static void main(String[] args)
    {
        Set<String> st =new TreeSet<>();
        st.add("one");
        st.add("two");
        st.add("three");
        st.add("four");

        System.out.println(" "+st);
        Set<Integer> st1 =new TreeSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        System.out.println(" "+st1);
    }
}