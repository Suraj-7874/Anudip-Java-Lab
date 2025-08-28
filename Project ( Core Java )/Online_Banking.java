import java.util.Scanner;

class BankProcess implements Runnable {
    Customer obj;

    public BankProcess(Customer obj) {
        this.obj = obj;
    }

    
    public void run() {
        try {
                obj.UserCheck();
                obj.Account_type();
                obj.Process();
                obj.display();
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Failed to create account ,information is invalid >>> fill information according to the passbook ...");
        } finally {
            obj.close();
            System.out.println("Thank you for visiting .....");
        }
    }
}

public class Online_Banking {
    public static void main(String[] args) {
        Customer obj = new Customer();
        BankProcess ob1 = new BankProcess(obj);

        try {
            Thread t = new Thread(ob1); 
            t.start(); 
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
