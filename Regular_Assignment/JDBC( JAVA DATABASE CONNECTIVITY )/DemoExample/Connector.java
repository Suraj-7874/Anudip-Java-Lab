package DemoExmaple;
import java.sql.*;
import java.util.Scanner;

public class Connector {
  Scanner sc = new Scanner(System.in);
  String url, user, pass;
  boolean done = false;
  Connection con;
  Statement st;
  String query;

  public void getCon() {
    try {
      System.out.print("\nEnter Database name to connect :-");
      String db = sc.nextLine();
      Class.forName("com.mysql.cj.jdbc.Driver");
      url = "jdbc:mysql://localhost:3306/" + db;
      System.out.print("Enter username :- ");
      user = sc.nextLine();
      System.out.print("Enter Password :- ");
      pass = sc.nextLine();

      con = DriverManager.getConnection(url, user, pass);
      System.out.println("\n\t Database connected successfully !!");
      done = true;

    } catch (Exception e) {
      System.err.println(e.getMessage());

    }
  }

  public void createTable() {
    try {
      System.out.print("Enter query to create table : ");
      query = sc.nextLine();
      st = con.createStatement();
      st.executeUpdate(query);
      System.out.println("\n\tTable created successfully !! ");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void insertValues() {
    try {
      System.out.print("Enter query to insert values into table : ");
      query = sc.nextLine();
      st = con.createStatement();
      int count = st.executeUpdate(query);
      if (count > 0) {
        System.out.println("\n\tData inserted successfully !! ");
      }

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

  public void displayData() {
    try {
      System.out.print("\nEnter table name to diaply :");
      String table_name = sc.nextLine();
      query = "select * from " + table_name;
      st = con.createStatement();
      ResultSet rs = st.executeQuery(query);

      ResultSetMetaData rsmd = rs.getMetaData();
      int columnCount = rsmd.getColumnCount();

      System.out.println("\n================================");
      for (int i = 1; i <= columnCount; i++) {
        System.out.print(rsmd.getColumnName(i) + "\t");
      }
      System.out.println();

      System.out.println("================================");
      while (rs.next()) {
        for (int i = 1; i <= columnCount; i++) {
          System.out.print(rs.getString(i) + "\t");
        }
        System.out.println();
      }
      System.out.println("================================");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void deleteData() {
    try {
      System.out.print("Enter query to delete data into table : ");
      query = sc.nextLine();
      st = con.createStatement();
      st.executeUpdate(query);
      System.out.println("\n\tData deleted successfully !! ");
      displayData();

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}



