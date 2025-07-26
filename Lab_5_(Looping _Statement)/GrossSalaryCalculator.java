import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice == -1) {
            System.out.print("Enter basic salary of the employee: ");
            double basic = sc.nextDouble();

            double hra, da, gross;

            if (basic > 15000) {
                hra = 0.20 * basic;
                da = 0.60 * basic;
            } else {
                hra = 3000;
                da = 0.70 * basic;
            }

            gross = basic + hra + da;

            System.out.println("Gross Salary = " + gross);

            System.out.print("Enter -1 to continue or any other number to stop: ");
            choice = sc.nextInt();
        }

        System.out.println("Program ended successfully !!.");
    }
}
