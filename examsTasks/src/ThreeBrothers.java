import java.util.Scanner;

public class ThreeBrothers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstBro = Double.parseDouble(sc.nextLine());
        double secondBro = Double.parseDouble(sc.nextLine());
        double thirdBro = Double.parseDouble(sc.nextLine());
        double daddy = Double.parseDouble(sc.nextLine());

        double timeInTotal = 1 / (1 / firstBro + 1 / secondBro + 1 / thirdBro);
        double percentOfTimeBrake = timeInTotal * 0.15;
        double timeWithBreak = timeInTotal + percentOfTimeBrake;
        String cleanTime = "Cleaning time: ";
        double timeleft = daddy - timeWithBreak;


        if (timeleft > 0) {

            double timeLeft = Math.floor(Math.abs( daddy - timeWithBreak));

            String secondText = "Yes, there is a surprise - time left -> ";
            String thirdText = " hours.";


            System.out.print(cleanTime);
            System.out.printf("%.2f%n", timeWithBreak);
            System.out.print(secondText);
            System.out.printf("%.0f", timeLeft);
            System.out.print(thirdText);


        } else if (timeleft < 0) {

            double timeLeft = Math.ceil(Math.abs( daddy - timeWithBreak));

            String fourth = "No, there isn't a surprise - shortage of time -> ";
            String fifth = " hours.";

            System.out.print(cleanTime);
            System.out.printf("%.2f%n", timeWithBreak);
            System.out.print(fourth);
            System.out.printf("%.0f", timeLeft);

            System.out.print(fifth);


        }

    }
}