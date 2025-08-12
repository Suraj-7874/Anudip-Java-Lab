import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class ReadFile {
 public static void main(String[] args)throws IOException,FileNotFoundException {
   try {
     FileWriter w =new FileWriter("Sample.txt");
     w.write("New text added !!");
     w.close();

     File f = new File("Sample.txt");
     if (f.length() != 0) {
      System.out.println("Successfully done logic ..");
     }
     Scanner sc= new Scanner(f);
     while (sc.hasNextLine()) {
      String line =sc.nextLine();
      System.out.println(line);
      
     }
     
     sc.close();
   } catch (Exception e) {
    System.err.println("File not exist");
    e.printStackTrace();
   }

 }
}


