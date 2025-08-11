import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try {
            RandomAccessFile ra = new RandomAccessFile("Sample.txt", "rw");

            String intro = "MY NAME IS SURAJ AND I AM FROM PUNE.";
            byte[] by = intro.getBytes();

           
            ra.write(by);

           
            ra.seek(0);

            long len = ra.length();
            System.out.println("Content of the file :- ");

            while (len > 0) {
                System.out.print((char) ra.read()); 
                len--;
            }

            System.out.println("\n\nSize of the file :- " + ra.length());

           
            ra.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
