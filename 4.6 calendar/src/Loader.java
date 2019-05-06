import java.text.SimpleDateFormat;
import java.util.*;

public class Loader {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1996, 1, 6);
        Calendar now = Calendar.getInstance();
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        int age = 0;

        while (calendar.before(now)) {
            System.out.println(age++ + " - " + dateFormat.format(calendar.getTime()) + " " + dayOfWeekFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
        }
    }
}

