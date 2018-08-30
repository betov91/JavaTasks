import java.util.Calendar;

public class calendarClassDecreement {



        public static void main(String[] args) {

            Calendar cal = Calendar.getInstance();
            System.out.println("Now : " + cal.getTime());

            int daysToIncrement = 5;

            cal.add(Calendar.DATE, daysToIncrement);
            System.out.println("Date after increment: " + cal.getTime());

        }
    }

