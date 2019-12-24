import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Birthday {

    public static void main(String[] args) {

        final int NUMBER_OF_YEARS = 21;
        int yearOFBirth = Calendar.getInstance().get(Calendar.YEAR) - NUMBER_OF_YEARS;

        SimpleDateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - EEE");
        Calendar calendar = new GregorianCalendar(yearOFBirth, Calendar.JUNE, 21);

        for (int i = 0; i <= NUMBER_OF_YEARS; i++) {
            String date = dateFormat.format(calendar.getTime());
            calendar.roll(Calendar.YEAR, 1);
            System.out.println(i + date);
        }

    }
}