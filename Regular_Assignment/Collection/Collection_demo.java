import java.util.ArrayList;
import java.util.List;

public class Collection_demo {
  public static void main(String args[])
  {
    List<String> name =new ArrayList<>();
    System.out.println("Initial size of ArrayList "+name.size());
    name.add("one");
    name.add("two");
    name.add("three");
    name.add("four");
    name.add("five");
     System.out.println("Initial size after add ArrayList "+name.size());
     System.out.println("Arraylist "+name);
     name.remove("four");
     System.out.println("Ater remove "+ name);

     List no =new ArrayList<>();
     no.add(10);
     no.add(10);
     no.add(10);
     no.add(10);
     no.add(10);
     System.out.println(no);
      int[] m = new int[no.size()];
      
        int sum = 0;

        for (int i = 0; i < no.size(); i++) {
            m[i] =(int) no.get(i); 
            sum += m[i];
        }
     System.out.println("Sum of Array :- "+sum);
    
  }
  
}
