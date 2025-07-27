class BankAccount {
    String accountHolderName;
    String bankName;
    double accountBalance;

    BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited " + amount + " to " + accountHolderName + "'s account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountHolderName + "'s account.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    public void display() {
        System.out.println("----------------------------------------------------");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Current Balance: " + accountBalance);
    }
}

public class BankOperations {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Suraj", "ICICI", 10000);
        BankAccount acc2 = new BankAccount("Pravin", "HDFC", 15000);
        BankAccount acc3 = new BankAccount("Mayur", "SBI", 8000);

        acc1.deposit(2000);
        acc1.withdraw(3000);

        acc2.deposit(1000);
        acc2.withdraw(2000);

        acc3.deposit(500);
        acc3.withdraw(10000);

        System.out.println("\n--- Final Account Balances ---");
        acc1.display();
        acc2.display();
        acc3.display();
    }
}
