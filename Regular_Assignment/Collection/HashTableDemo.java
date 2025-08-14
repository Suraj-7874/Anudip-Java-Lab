import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
  public static void main(String[] args) {
    Hashtable<Integer,String> ht =new Hashtable<>();
    ht.put(10, "Suraj");
    ht.put(20, "Pream");
    ht.put(30, "Sai");
    ht.put(40, "Somanath");
    ht.put(50, "Kumar");
    System.out.println("|_Id_|____Name____|");
    for(Map.Entry h:ht.entrySet())
    {
      System.out.println("| "+ h.getKey() + " |\t" +h.getValue()+"\t  |");
    }
    System.out.println("|____|____________|");

  }
  
}
