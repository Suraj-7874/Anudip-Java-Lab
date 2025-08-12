import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class SpaceCount {
  public static void main(String[] args)throws IOException{
     Reader r;
     if(args.length == 0)
     {
       System.out.print("\n(Press Ctrl+D after complete writing and press Ctrl + c to see result :- )\n Write here ... ");
      r = new InputStreamReader(System.in);

     }
     else{
       r= new FileReader(args[0]);
     }
     int ch ;
     int total ;
     int space =0;
     for(total = 0;((ch = r.read()) != -1);total++ )
     {
      if (Character.isWhitespace((char) ch)) {
        space++;
      }
     }
     System.out.println(total + "Chaacters "+ space +" Space");

  }    
  }

