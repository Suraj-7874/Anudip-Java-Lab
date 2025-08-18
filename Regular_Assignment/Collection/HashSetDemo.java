//=================================================================================================================
//  1. Write a Java program that demonstrates the following operations on a HashSet:
// ● Create a HashSet of integers.
// ● Add the numbers 5, 10, 15, 20, and 25 to the set.
// ● Display the elements of the set.
// ● Check if the set contains the number 10.
// ● Remove the number 15 from the set.
// ● Display the size of the set.
// =================================================================================================================

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetDemo {
  static Scanner sc = new Scanner(System.in);
  static HashSet<Integer> hs = new HashSet<>();
  static int no;

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println(
          "\n\nOperations :-\n1.Add numbers :\n2.Display Elements :\n3.Search element :\n4.Remove Element :\n5.Display Size :\n6.Exit :");
          System.out.println("Note: Before performing other operations, make sure to add elements first (choice 1).");
      System.out.print("\nEnter your choice : ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          AddNumber();
          break;
        case 2:
          DisplayElements();
          break;
        case 3:
          SearchElement();
          break;
        case 4:
          RemoveElement();
          break;
        case 5:
          DisplaySize();
          break;
        case 6:
          System.out.println("\nProgram exited successfully !!");
          break;

        default:
          System.out.println("\nInvalid choice !!");
          break;
      }

    } while (choice != 6);
  }

  public static void AddNumber() {
    System.out.print("\nHow many integers ? : ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {

      System.out.print("Enter Element " + (i + 1) + " = ");
      no = sc.nextInt();
      hs.add(no);
    }
    System.out.println("\n Note :- Duplicate elements are not allowed. If entered, they will not be counted. >>");
    System.out.println("\n" + hs.size() + " Elements added Successfully >>");
  }

  public static void DisplayElements() {
    Iterator<Integer> itr = hs.iterator();
    if (!hs.isEmpty()) {
      System.out.print("\nHashSet Element :- ");
    while (itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
    } else {
      System.out.println("\nHashset is Empty !! please add the elements >>");
    }
    
  }

  public static void SearchElement() {
    System.out.print("\nEnter number to search: ");
    int find = sc.nextInt();
    if (hs.contains(find)) {
      System.out.println("\n" + find + " is present in the set.");
    } else {
      System.out.println("\n" + find + " is not found in the set.");
    }
  }

  public static void RemoveElement() {
    DisplayElements();
    System.out.print("\nEnter number to remove: ");
    int num = sc.nextInt();
    if (hs.remove(num)) {
      System.out.println("\n" + num + " removed successfully.");
      DisplayElements();
    } else {
      System.out.println("\n" + num + " not found in the set.");
    }
  }

  public static void DisplaySize() {
    DisplayElements();
    System.out.println("\nSize of the set: " + hs.size());
  }
}
