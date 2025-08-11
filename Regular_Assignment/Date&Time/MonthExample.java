import java.time.Month;

public class MonthExample {
  public static void main(String[] args) {
    
      int Year = 2025 ;
      System.out.println("Months and number of days in year " + Year + ":");

      for (Month m : Month.values()) {
            int days = m.length(false);
            System.out.println(m + " - " + days + " days");
        }
  }
}
