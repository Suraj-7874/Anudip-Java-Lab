import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Student " + i + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            int[] marks = new int[5];
            int total = 0;

            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
                total += marks[j];
            }

            double percentage = total / 5.0;
            String grade;

            if (percentage >= 90)
                grade = "A";
            else if (percentage >= 80)
                grade = "B";
            else if (percentage >= 70)
                grade = "C";
            else if (percentage >= 60)
                grade = "D";
            else
                grade = "F";

            System.out.println("\n--- Student Result ---");
            System.out.println("Name    : " + name);
            System.out.println("Address : " + address);
            System.out.println("Total   : " + total);
            System.out.println("Percent : " + percentage + "%");
            System.out.println("Grade   : " + grade);

            sc.nextLine(); 
        }

        sc.close();
    }
}
