import java.util.*;


public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();  
            System.out.println("You entered number : " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer .");
        }

       
    }
}
