import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteCount {
    public static void main(String[] args) throws IOException {
        InputStream is;

        if (args.length == 0) {
            System.out.print("\n(Press Ctrl+D after complete writing and press Ctrl + c to see result :- )\n Write here ... ");
            is = System.in; 
        } else {
            is = new FileInputStream(args[0]); 
        }

        int total = 0;
        while (is.read() != -1) {
            total++;
        }
       
        System.out.println("Total bytes: " + total);
        is.close();
    }
}
