public class Registration extends Bank {
  boolean login = false;
 

  public void UserCheck() {
    do {

      System.out.println("\n\n Welcome To The Online Banking System \n");

      System.out.print("You have an account (Y/N): ");
      check = sc.next().charAt(0);
      sc.nextLine();

      if (check == 'Y' || check == 'y') {
        System.out.print("\nEnter your username: ");
        String user = sc.nextLine();

        System.out.print("\nEnter your password: ");
        int pass = sc.nextInt();

        System.out.print("\nEnter your Account number: ");
        int accNo = sc.nextInt();

        if (user.equals(username) && pass == password || accNo == account_no) {
          System.out.println("\nYou have successfully logged in!\n");
          login = true;
        } else {
          System.out.println("\n User Not Found");
        }

      } else {
        System.out.println("\nPlease create new account :- \n");

        System.out.print("Note :- Fill The information According To The Passbook\n");

        System.out.print("\nEnter the account holder name :-  ");
        New_user = sc.nextLine();
        username = New_user;
        System.out.print("\nEnter your Account number: ");
        New_accNo = sc.nextInt();
        account_no = New_accNo;
        sc.nextLine(); 

        System.out.print("\nEnter phone number :-");
        new_phoneNO = sc.nextLong();
        phoneNumber =new_phoneNO;
        sc.nextLine();

        System.out.print("\nEnter Mobile linked Addare card number :-");
        new_addar = sc.nextLong();
        Addar_no = new_addar;
        sc.nextLine(); 

        System.out.print("\nEnter your Pancard number : ");
        new_pan = sc.nextLine();
        pancard = new_pan;
        sc.nextLine();
        System.out.print("Enter your Address : ");
        new_address = sc.nextLine();
        Address = new_address;

        System.out
            .print("\nRs.2000 minumum balanace required to create your online account For next process enter(Y/N) :-");
        check = sc.next().charAt(0);
        if (check == 'Y' || check == 'y') {
          do {
            System.out.print("Enter your password to set: ");
            newPassword = sc.nextInt();
            System.out.print("Enter confirm password: ");
            confirmPassword = sc.nextInt();
            if (newPassword == confirmPassword) {
              password = newPassword;
              System.out.println("\nDear " + New_user + " , your Online Bank Account is Created and login Successfully :) \n");
              login = true;
            } else {
              System.out.println("\nPassword not match re-enter !!");
            }

          } while (login != true);
        } else {
          System.out.println("\nProcess Terminated ");
        }
      }
    } while ( login != true);

  }

}
