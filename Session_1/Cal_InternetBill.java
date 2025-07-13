import java.util.Scanner;

public class Cal_InternetBill
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        double dataUsed, bill;

        System.out.print("Enter total data consumed in GB: ");
        dataUsed = sc.nextDouble();

        if (dataUsed < 10) 
        {
            bill = 300;  
        } else if (dataUsed <= 30) {
            bill = 300 + 5 * (dataUsed - 10);
        } else {
            bill = 400 + 3 * (dataUsed - 30);
        }

        System.out.println("Your total monthly internet bill is: Rs. " + bill);
    }
}
