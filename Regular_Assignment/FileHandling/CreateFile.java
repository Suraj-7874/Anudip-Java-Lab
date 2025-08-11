import java.io.File;

public class CreateFile {
  public static void main(String[] args) {
    try {
          File f=new File("NewOneFile.txt");
          if(f.createNewFile())
          {
            System.out.println("File is created succesfully !!!"+f.getName());
          }
          else{
            System.out.println("File is already exists "+f.getName());
            System.out.println("Check here : -" +f.getAbsolutePath());
          }
    } catch (Exception e) {
     e.printStackTrace();
    }
  }
}
