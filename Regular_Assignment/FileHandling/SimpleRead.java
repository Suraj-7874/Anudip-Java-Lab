import java.io.FileInputStream;
import java.io.IOException;

public class SimpleRead {
  public static void main(String[] args) throws IOException {
    FileInputStream f = new FileInputStream("Sample.txt");
    int n;
    while ((n = f.read()) != -1) {
      System.out.print((char) n);

    }
    f.close();

  }
}
