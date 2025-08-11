import java.io.File;

import javax.swing.text.StyledEditorKit.BoldAction;

public class FileCreate {
  public static void main(String[] args) {
    File f= null ;
    boolean b= false ;
    try {
      f =new File("Sample.txt");
      b =f.createNewFile();
      System.out.println("File created :- "+b);
      f.delete();
      System.out.println("File deleted Successfully !!");
      b = f.createNewFile();
      System.out.println("File Created :- "+b);

      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
