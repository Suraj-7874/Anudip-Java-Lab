package DemoExample;
import java.util.*;

import DemoExample.*;

public class JdbcOperations {
static int choice;
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  Connector c= new Connector();
  do {
    System.out.print("\n1. Connect database :\n");
    System.out.print("2. Create table : \n");
    System.out.print("3. Insert value into table :\n");
    System.out.print("4. Display table :\n");
    System.out.print("5. Exit : \n");
    System.out.print("Enter your choice :- ");
    choice =sc.nextInt();
    switch (choice) {
      case 1:
            c.getCon();
        break;
      case 2:

          if (c.done) {
             c.createTable();
          } else {
            System.out.println("Please connect database to create table  !!");
          }
           
        break;
      case 3:

          if (c.done) {
             c.insertValues();
          } else {
            System.out.println("Please connect database and create table to insert values  !!");
          }
           
        break;
      case 4:
              c.displayData();
        break;
      case 5:
           System.out.println("\n\tProgram run successfully !!");
        break;
    
      default:
        break;
    }
    
  } while (choice != 5);
 
 }
}

