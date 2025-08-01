import java.util.Scanner;

public class Online_Banking {
  public static void main(String[] args) {

    Customer obj = new Customer();
    try {

      obj.UserCheck();
      obj.Account_type();
      obj.Process();
      obj.display();

    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    } finally {
      obj.close();
      System.out.println("Thank you for visiting .....");
    }
  }
}
