import java.util.Scanner;

public class gameOfIntervals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double timePerGame = Double.parseDouble(scanner.nextLine());

        double zeroNinePer = 0;
        double nineNineteenPer = 0;
        double twentyThirtyPer = 0;
        double thirtyFortyPer = 0;
        double fortyFiftyPer = 0;
        double invalidPer = 0;

        double zeroNine = 0;
        double nineNineteen = 0;
        double twentyThirty = 0;
        double thirtyForty = 0;
        double fortyFifty = 0;
        double invalid = 0;

        double points = 0;
        double invalidNum = 0;
        double sumInvalid = 0;
        double sum = 0;
        double sumPoints = 0;

        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;
        double percent4 = 0;
        double percent5 = 0;
        double percent6 = 0;

        for (int i = 0; i < timePerGame; i++) {

            double n = Double.parseDouble(scanner.nextLine());


            if (n >= 0 && n <= 9) {

                points = n * 0.20;
                sumPoints += points;

                zeroNinePer += 1;
                percent1 = (zeroNinePer * 100) / timePerGame;


            } else if (n > 9 && n <= 19) {

                points = n * 0.30;
                sumPoints += points;

                nineNineteenPer += 1;
                percent2 = (nineNineteenPer * 100) / timePerGame;


            } else if (n >= 20 && n < 30) {

                 points = n * 0.40;
                sumPoints += points;

                twentyThirtyPer += 1;
                percent3 = (twentyThirtyPer * 100) / timePerGame;


            } else if (n >= 30 && n < 40) {

                n = 1;
                points = n * 50;
                sumPoints += points;

                thirtyFortyPer += 1;
                percent4 = (thirtyFortyPer * 100) / timePerGame;


            } else if (n >= 40 && n <= 50) {

                n = 1;
                points = n * 100;
                sumPoints += points;

                fortyFiftyPer += 1;
                percent5 = (fortyFiftyPer * 100) / timePerGame;


            } else if (n < 0 || n > 50) {

                sumPoints /= 2;

                invalidPer += 1;
                percent6 = (invalidPer * 100) / timePerGame;


            }


        }

        System.out.printf("%.2f\n", sumPoints);

        System.out.printf("From 0 to 9: %.2f%%\n", percent1);
        System.out.printf("From 10 to 19: %.2f%%\n", percent2);
        System.out.printf("From 20 to 29: %.2f%%\n", percent3);
        System.out.printf("From 30 to 39: %.2f%%\n", percent4);
        System.out.printf("From 40 to 50: %.2f%%\n", percent5);
        System.out.printf("Invalid numbers: %.2f%%\n", percent6);


    }
}
