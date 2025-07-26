import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int num;

        while (true) {
            System.out.print("\nEnter a number (-1 to stop): ");
            num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total Even numbers: " + even);
        System.out.println("Total Odd numbers: " + odd);
    }
}
