import java.util.Calendar;
import java.util.Scanner;

public class calendarClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



       int hoursLong = 15;
       int hourShort = 13;

       int workTime = Integer.parseInt(scanner.nextLine());









        if (workTime == hoursLong){

            Calendar now = Calendar.getInstance();
            System.out.println("Current Date : " + (now.get(Calendar.MONTH) + 1) + "-"
                    + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
            System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY) + ":"
                    + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
            now.add(Calendar.HOUR, 15);
            System.out.println("Driving time will be finished in " + now.get(Calendar.HOUR_OF_DAY) + ":"
                    + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND) + " o'clock" );

        }else if (workTime == hourShort){

            Calendar now = Calendar.getInstance();
            System.out.println("Current Date : " + (now.get(Calendar.MONTH) + 1) + "-"
                    + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
            System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY) + ":"
                    + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
            now.add(Calendar.HOUR, 13);
            System.out.println("Driving time will be finished in " + now.get(Calendar.HOUR_OF_DAY) + ":"
                    + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND) + " o'clock" );


        }else{

            System.out.println("Wrong number! Try with 13 or 15 hours!");
        }








    }
}





