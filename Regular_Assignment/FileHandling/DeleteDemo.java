import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteDemo {
  public static void main(String[] args)throws IOException,FileNotFoundException {
    try {
      File  f = new File("NewOne.txt");
      if (f.createNewFile()) {
        System.out.println("File is created Successfully >>>>>>>");
        
      }
      f.delete();
      System.out.println("File deleted >>");
      
    } catch (Exception e) {
    System.out.println(e.getMessage());
    }
  }
}
