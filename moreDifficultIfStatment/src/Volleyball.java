import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String kindOfYear = scanner.nextLine();
        double numHolydaysOfYear = Double.parseDouble(scanner.nextLine());
        double homeWeekends = Double.parseDouble(scanner.nextLine());


       double holydaysGames = numHolydaysOfYear * 2/3;
       int weekendOfyear = 48;
       double weekendsinSofia = 48 - homeWeekends;
       double playedGameInSofia = weekendsinSofia * 3/4;

       double totalGames = holydaysGames + playedGameInSofia + homeWeekends;
       double percentInLeapYear = totalGames * 0.15;
        double totalPlusPercent = percentInLeapYear + totalGames;

        if (kindOfYear.equals("leap")){

            System.out.printf("%.0f",Math.floor(totalPlusPercent));

        }else if (kindOfYear.equals("normal")){

                System.out.printf("%.0f",Math.floor(totalGames));
        }



        }
}
