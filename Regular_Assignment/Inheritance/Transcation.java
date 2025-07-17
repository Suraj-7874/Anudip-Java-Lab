public class Transcation extends Account {
  int pin;
  boolean process_Done = false;

  public void Process() {
    if (c == 1 || s == 1 || f == 1) {
      do {

        System.out
            .println("\n\n1. Deposite :- \n2. Withdrawal :- \n3. Loan :- \n4. Balance inquiries :- \n5. Exit :- ");
        System.out.print("Enter your choice (1/2/3/4/5) = ");
        choice = sc.nextInt();

        switch (choice) {
          case 1:
            System.out.print("Enter the Amount to deposite :- ");
            amount = sc.nextDouble();
            System.out.print("Enter your Pin :- ");
            int pin = sc.nextInt();
            if (pin == password) {
              min_balance += amount;
              System.out.println(" \n Rs. " + min_balance + " amount has been successfully Deposited .");

            } else {
              System.out.println("\n Incorrect Password !!");
            }

            break;
          case 2:
            System.out.print("Enter the Amount to withdrawal  :- ");
            amount = sc.nextDouble();

            if (amount >= min_balance) {
              System.out.println("\n Your Balance is insufficent please check balance !!");

            } else {
              System.out.print("Enter your Pin :- ");
              pin = sc.nextInt();
              if (pin == password) {
                min_balance -= amount;
                System.out.println("\n Rs. " + min_balance + " amount has been successfully Withdrawal .");

              } else {
                System.out.println("\nIncorrect Password !!");
              }
            }

            break;

          case 3:
            System.out.println("\n For your loan Application process please vist the bank");

            break;
          case 4:
            System.out.println("\n Total Account Balance is = Rs. " + min_balance);
            break;
          case 5:
            System.out.println("\n Exit Successfully ....\n");
            process_Done = true;
            break;

          default:
            System.out.println("Invalid choice");
            break;
        }

      } while (choice != 5);

    }
  }
}
