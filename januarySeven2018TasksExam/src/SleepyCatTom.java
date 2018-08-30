import java.util.Scanner;

public class SleepyCatTom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int notWorkDays = Integer.parseInt(scanner.nextLine());

        double workDays = 365;
        double diff = workDays - notWorkDays;
        double timeRest = notWorkDays * 127;
        double timeWork = diff * 63;
        double totalPlayTime = timeRest + timeWork;




        if (totalPlayTime < 30_000){

            double leftOver = 30000 - totalPlayTime;
            double timeInHour = Math.floor(leftOver /60);
            double timeMin = leftOver % 60;

            System.out.printf("Tom sleeps well\n " +
                    "%.0f hours and %.0f minutes less for play",timeInHour,timeMin );


        }else if(totalPlayTime > 30_000){

            double leftOver = totalPlayTime - 30000;
            double timeInHour = Math.floor(leftOver / 60);
            double timeMin = leftOver % 60;

            System.out.printf("Tom will run away\n" +
                    "%.0f hours and %.0f minutes more for play",timeInHour, timeMin );
        }



    }

}
