public class Customer extends Transcation {
  public void display() {
    if (process_Done) {
      System.out.println("-------------------------------------------");
      System.out.println("Customer Details :- ");
      System.out.println("-------------------------------------------");
      System.out.println("Account holder name = \t" +             username);
      System.out.println("Account Number = \t" +                getAccountNumber());
      System.out.println("Phone number = \t\t" +                 phoneNumber);
      System.out.println("Local Address = \t" +                    Address);
      System.out.println("Mobile linked Addar card number =" + Addar_no);
      System.out.println("Pan card number = \t" +                  pancard);
      if (c == 1) {
        System.out.println("Account type :-\t     Current");
      } else if (s == 1) {
        System.out.println("Account Type :-\t   Saving");
      } else {
        System.out.println("Account Type :-\t    Fix Deposite");
      }
      System.out.println("Total Balance:- \t" + min_balance);
      System.out.println("-------------------------------------------");
    }
  }
  public void close()
  {
    sc.close();
  }
}
