import java.time.MonthDay;

public class IndependenceDayCheck {
 public static void main(String args[])
 {  
  MonthDay today = MonthDay.now();
  MonthDay indDay =MonthDay.of(8, 15);

  if (today.equals(indDay)) {
            System.out.println(today +"Happy Independence Day!");
        } else if (today.isBefore(indDay)) {
            System.out.println("Independence Day is yet to come this year.");
        } else {
            System.out.println("Independence Day was already celebrated this year.");
        }

 }
  
}
