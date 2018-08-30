import java.util.Scanner;

public class timeForExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double examHour = Double.parseDouble(scanner.nextLine());
        double examMin = Double.parseDouble(scanner.nextLine());
        double arrivalHour = Double.parseDouble(scanner.nextLine());
        double arrivalMin = Double.parseDouble(scanner.nextLine());


        double examTime = (examHour * 60) + examMin;
        double arrivalTime = (arrivalHour * 60) + arrivalMin;

        double diff = examTime - arrivalTime;


        double printHH = 0;
        double printMM = 0;

        String onTime = "On time";
        String earlyTime = "Early";
        String lateTime = "Late";
        String beforeT = "before the start";
        String afterT = "after the start";
        String min = "minutes";
        String hour = "hours";


//  1 първо пишем логика за това, кога ще е подранил в диапазона до 30 мин. преди началото.
//  2 послед за това кога е подранил с повече от 30 мин.
////  3 след това за това кога ще е закъснял.


// right on time
        if ((diff > 0 )) {

            System.out.printf("%s", onTime);

            // 30 min before
        } else if (diff > 0 && diff <= 30) {

            System.out.printf("%s%n%.0f %s %s ", onTime, diff, min, beforeT);


        } else {
// above 30 min earlier
            printHH = diff / 60;
            printMM = diff % 60;

            System.out.printf("%s%n", earlyTime);


            if (printHH == 0 && printHH < 1) {

                System.out.printf("%.0f %s", printMM, beforeT);


            } else {

                if (printMM < 10) {

                    System.out.printf("%.0f:0%.0f %s", printHH, printMM, beforeT);
                } else {

                    System.out.printf("%.0f:%.0f %s", printHH, printMM, beforeT);

                }
                // when student is late
                if (diff < 0) {

                    printHH = diff / 60;
                    printMM = diff % 60;

                    System.out.printf("%.0f %s", printMM, lateTime);

                } else {
                    if (printMM < 10) {

                        System.out.printf("%.0f:0%.0f %s", printHH, printMM, lateTime);
                    } else {

                        System.out.printf("%.0f:%.0f %s", printHH, printMM, lateTime);


                    }


                }
            }
        }}}





