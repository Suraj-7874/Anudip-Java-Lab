import java.util.Scanner;

public class Calculator 
{

    
    int add(int a, int b) 
    {
        return a + b;
    }

  
    int add(int a, int b, int c)
     {
        return a + b + c;
    }

    double add(double a, double b)
     {
        return a + b;
    }

 
    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter two integers: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Sum (int, int): " + calc.add(x1, x2));

      
        System.out.print("Enter three integers: ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Sum (int, int, int): " + calc.add(y1, y2, y3));

       
        System.out.print("Enter two decimal numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum (double, double): " + calc.add(d1, d2));

        
    }
}
