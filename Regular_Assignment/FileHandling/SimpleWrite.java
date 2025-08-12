import java.io.FileOutputStream;

public class SimpleWrite {
  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("NewOne.txt");
      String text ="I LOVE JAVA <3 ";
      byte b[]= text.getBytes();
      fout.write(b);
      fout.close();
      System.out.println("Success > ");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
