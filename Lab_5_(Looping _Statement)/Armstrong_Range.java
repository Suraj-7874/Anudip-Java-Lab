import java.util.Scanner;

public class Armstrong_Range {
  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Armstrong numbers :- ");
    System.out.print("Enter start of range: ");
    int start = sc.nextInt();

    System.out.print("Enter end of range: ");
    int end = sc.nextInt();

    System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
    for (int i = start; i < end; i++) {
      if (printArmstrongNumber(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static boolean printArmstrongNumber(int n) {
    int sum = 0;
    int original = n;
    int digits = countDigits(n);

    while (n != 0) {
      int digit = n % 10;
      sum += power(digit, digits);
      n /= 10;
    }

    return sum == original;
  }

 
  public static int countDigits(int num) {
    int count = 0;
    while (num != 0) {
      count++;
      num /= 10;
    }
    return count;
  }

  
  public static int power(int base, int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
      result *= base;
    }
    return result;
  }
}

  

