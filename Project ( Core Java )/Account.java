public class Account extends Registration {
  int c, s, f = 0;

  public void Account_type() {
    if (login) {
      System.out.println("1. Current \n2. Saving \n3. FD");
      System.out.print("Enter your Account type (1/2/3): ");
      type = sc.nextInt();

      switch (type) {
        case 1:
          System.out.println("\nYou are selected Current Account :- ");
          c++;
          break;
        case 2:
          System.out.println("\n You are selected Saving Account :- ");
          s++;
          break;
        case 3:
          System.out.println("\n You are selected Fix Deposite Account :- ");
          f++;
          break;

        default:
          System.out.println("Invalid Choice !!");
          break;
      }
    }
  }
}
