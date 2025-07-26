import java.util.Scanner;

public class Sum_Average {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int sum =0 ;
    int i;
    System.out.print("Enter Array size :- ");
    int n =sc.nextInt();
    int[] arr =new int[n];
    System.out.print("Enter Array Elements :- ");
    for( i = 0 ; i < n ;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.print("Array elements :- ");
    for( i = 0 ; i < n ;i++)
    {
      sum += arr[i];
      System.out.print(arr[i]+"\t");
    }
    double average = (double) sum / n;
   
    System.out.println("\nSum : "+ sum);
    System.out.println("Average :- "+average);
    
  }
  
}
