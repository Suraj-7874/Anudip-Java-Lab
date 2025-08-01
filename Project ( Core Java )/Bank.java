import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Bank {
  Scanner sc = new Scanner(System.in);
  String New_user, username = "Suraj";
  private int password = 123, account_no = 123456789;

  long new_phoneNO, phoneNumber = 9011452576L;
  long new_addar, Addar_no = 123412341234L;
  String new_pan, pancard = "ABC12345SS";
  String new_address, Address = "Dighi pune 411015";
  
  boolean login;
  int type, choice, New_accNo, newPassword, confirmPassword;

  char check;
  double min_balance = 2000.00;
  double amount;

  public int getPassword()
  {
    return password;
  }
  public int getAccountNumber()
  {
    return account_no;
  }
  public void setPassword(int password) 
	{
		this.password = password;
	}
  public void setAccount_no(int account_no) 
	{
		this.account_no = account_no;
	}
}