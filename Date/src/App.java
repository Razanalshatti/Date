import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Current date 
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        // Adding 5 days from the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();

        // Future date after adding 5 days
        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 5 days: " + formattedFutureDate);
    }
}