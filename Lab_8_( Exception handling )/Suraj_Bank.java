import java.util.Scanner;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}


public class Suraj_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);  

        System.out.println("Welcome.. ");
        System.out.println("Current Balance: " + account.getBalance());

        try {
            System.out.print("Enter amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
