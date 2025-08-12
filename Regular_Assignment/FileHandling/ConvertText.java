

public class ConvertText {
  public static void main(String[] args) {
    try {
      byte from = (byte) args[0].charAt(0);
      byte to = (byte) args[1].charAt(0);
      int n ;
      while ((n = System.in.read()) != -1) {
        System.out.write(n == from ? to: n);;
      }
    } catch (Exception e) {

      System.err.println(e.getMessage());
    }
  }
}
//to run first compile it , then java ConvertText a B ( replace a to B )
//Example :- apple --> Bpple