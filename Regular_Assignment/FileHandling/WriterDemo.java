package LetsSolveSomeProblems;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
  public static void main(String[] args)throws IOException {
    Writer w = new FileWriter("Example.txt");
    String s ="I LOVE JAVA <3";
    w.write(s);
    w.close();
    System.out.println("Process done >>");    
  }
}
 