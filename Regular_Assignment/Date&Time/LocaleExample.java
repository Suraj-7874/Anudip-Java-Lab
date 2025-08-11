import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample
 {
    public static void main(String[] args)
     {
        double amount = 123456.78;
         Locale italian = Locale.ITALY;
        NumberFormat italianFormat = NumberFormat.getNumberInstance(italian);
        String formattedItalian = italianFormat.format(amount);
        System.out.println("Italian Format: " + formattedItalian);

       
        Locale korean = Locale.KOREA;
        NumberFormat koreanCurrency = NumberFormat.getCurrencyInstance(korean);
        String formattedKoreanCurrency = koreanCurrency.format(amount);
        System.out.println("Korean Currency Format: " + formattedKoreanCurrency);
    }
}
