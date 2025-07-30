import java.util.Scanner;

public class ParseIntExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            String input = sc.nextLine();  
            // String input = "null";  remove comments for see NullPointerException

            int number = Integer.parseInt(input);
            System.out.println("Parsed integer: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null input is not allowed.");
        }
          sc.close();
       
    }
}
