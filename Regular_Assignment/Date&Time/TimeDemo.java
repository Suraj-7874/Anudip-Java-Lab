import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo
{
  public static void main(String args[])
  {
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
    String formattedDateTime = currentDateTime.format(format);
    
    System.out.println("Formate Date and Time : "+formattedDateTime);
  }
}