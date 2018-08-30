import java.util.Calendar;
import java.util.Scanner;

public class truckTimeLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int workTimeLong = 15;
        int workTimeShort = 13;
        int driveTimeLong = 10;
        int driveTimeShort = 9;
        int restTimeLong = 11;
        int restTimeShort = 9;


        int driverTimeLeft = Integer.parseInt(scanner.nextLine());


        Calendar now = Calendar.getInstance();
        System.out.println("Current Date : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
        System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY) + ":"
                + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
        now.add(Calendar.HOUR, driverTimeLeft);
        System.out.println("Driving time will be finished in " + now.get(Calendar.HOUR_OF_DAY) + ":"
                + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND) + " o'clock");


    }

}
