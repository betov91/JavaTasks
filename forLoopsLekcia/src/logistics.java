import java.util.Scanner;

public class logistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        double autobus = 0;
        double truck = 0;
        double train = 0;
        double autobusTones = 0;
        double truckTones = 0;
        double trainTones = 0;
        double tonesInTotal = 0;


        for (int i = 0; i < n; i++) {

            int tones = Integer.parseInt(scanner.nextLine());

            tonesInTotal += tones;

            if (tones <= 3) {
                autobusTones += tones;

                autobus = autobusTones * 200;

            } else if (tones > 3 && tones <= 11) {

                truckTones += tones;
                truck = truckTones * 175;

            } else if (tones > 11) {

                trainTones += tones;
                train = trainTones * 120;


            }

            double middlePrice = (autobus + truck + train) / tonesInTotal;


        }

        double middlePrice = (autobus + truck + train) / tonesInTotal;
        double autobusPercent = autobusTones / tonesInTotal * 100;
        double truckPercent = truckTones / tonesInTotal * 100;
        double trainPercent = trainTones / tonesInTotal * 100;

        System.out.printf("%.2f\n", middlePrice);
        System.out.printf("%.2f%%\n", autobusPercent);
        System.out.printf("%.2f%%\n", truckPercent);
        System.out.printf("%.2f%%\n", trainPercent);


    }
}
