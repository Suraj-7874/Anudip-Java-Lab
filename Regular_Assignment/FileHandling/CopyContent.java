import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyContent {
  public static void main(String[] args)throws IOException {
    int x;
    FileInputStream fin;
    FileOutputStream fout;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter first File name :- ");
    String f1 = br.readLine();
    System.out.print("Enter Second File name :- ");
    String f2 = br.readLine();
    
      try {

        fin = new FileInputStream(f1);
        fout = new FileOutputStream(f2);
      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
        return;
    }
    do{
    x = fin.read();
    if (x != -1)
      fout.write(x);

  }while(x!=-1);
  if (fout.equals(fin)) {
    System.out.println("File Copied successfully >>");
  } else {
    System.out.println("Not Copied >>>");
  }
  br.close();
  fin.close();
  fout.close();
}}