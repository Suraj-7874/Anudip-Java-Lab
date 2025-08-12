import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
  public static void main(String[] args)throws IOException {
    int x ;
    FileInputStream fin ;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter your file name :- ");
    String Fname =br.readLine();
    try {
      fin =new FileInputStream(Fname);
    } catch (FileNotFoundException e) {
    System.out.println("File not Found !!");
    System.err.println(e.getMessage());
    return;
    }
    do {
      x=fin.read();
      if(x != -1)
      System.out.print((char)x);
    } while (x != -1);
    fin.close();
  }
}
