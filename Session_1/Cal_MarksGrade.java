import java.util.Scanner;

public class Cal_MarksGrade 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double average;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects (out of 100 each):");

        for (int i = 1; i <= subjects; i++) 
        {
            System.out.print("Subject " + i + ": ");
            int mark = sc.nextInt();
            total += mark;
        }

        average = (double) total / subjects;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average + "%");

       
        if (average > 90) 
        {
            System.out.println("Grade: Ex");
        } else if (average > 80)
         {
            System.out.println("Grade: A");
        } else if (average > 60)
        {
            System.out.println("Grade: B");
        } else if (average >= 40)
         {
            System.out.println("Grade: C");
        } else 
        {
            System.out.println("Grade: F");
        }
    }
}
