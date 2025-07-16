import java.util.Scanner;


class SwapBase 
{
    int a, b;

    public void getInput() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
    }

    public void displayValues(String str)
     {
        System.out.println(str + " a = " + a + ", b = " + b);
    }
}


class SwapOperations extends SwapBase
 {

    public void swapVar() 
    {
        int temp = a;
        a = b;
        b = temp;
        displayValues("After swap using 3rd variable:");
    }

    public void swapNoThirdVar()
     {
        a = a + b;
        b = a - b;
        a = a - b;
        displayValues("After swap without using 3rd variable:");
    }
}

public class SwapDemo
 {
    public static void main(String[] args)
    {

        SwapOperations obj = new SwapOperations();

        obj.getInput();
        obj.displayValues("Original values:");
        obj.swapVar();
        obj.swapVar();
        obj.swapNoThirdVar();
    }
}
