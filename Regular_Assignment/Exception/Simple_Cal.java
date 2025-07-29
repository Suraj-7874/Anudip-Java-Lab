import java.util.Scanner;

public class Simple_Cal {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the First number: ");
            double no1 = sc.nextDouble();

            System.out.print("Enter the Second number: ");
            double no2 = sc.nextDouble();

            do {
                System.out.println("\n1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1-5): ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Addition: " + (no1 + no2));
                        break;
                    case 2:
                        System.out.println("Subtraction: " + (no1 - no2));
                        break;
                    case 3:
                        System.out.println("Multiplication: " + (no1 * no2));
                        break;
                    case 4:
                        if (no2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Division: " + (no1 / no2));
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }

       
    }
}
