import java.io.File;

public class FileDemo {
  public static void main(String[] args) {
    File f  =new File("Sample.txt");
    System.out.println("is file = "+f.isFile());
    System.out.println("Name :- "+f.getName());
    System.out.println("Size :- "+f.length());
    System.out.println("Path :- "+f.getAbsolutePath());
    System.out.println("Parent :- "+f.getParent());
    System.out.println("is Hidden :- "+f.isHidden());
    System.out.println(f.getTotalSpace());
    System.out.println(f.canRead());
  }
}
