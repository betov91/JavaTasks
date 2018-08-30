import java.util.Scanner;

public class footballLeague {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double capacityOfStadium = Double.parseDouble(scanner.nextLine());
        double numOfFans = Double.parseDouble(scanner.nextLine());

        double aSector = 0;
        double bSector = 0;
        double vSector = 0;
        double gSector = 0;

        double percentFanAgainstStadium = 0;

        double sum = 0;

        double percentA = 0;
        double percentB = 0;
        double percentV = 0;
        double percentG = 0;

        double fansStadiumPercent = (numOfFans / capacityOfStadium) * 100;

        for (int i = 1; i <= numOfFans; i++) {

            String sector = scanner.nextLine();


            if (sector.equalsIgnoreCase("A")) {

                aSector += 1;

            } else if (sector.equalsIgnoreCase("B")) {

                bSector += 1;

            } else if (sector.equalsIgnoreCase("v")) {

                vSector += 1;

                //System.out.printf("%.2f\n",percentV);

            } else if (sector.equalsIgnoreCase("G")) {

                gSector += 1;

            }

            percentA = (aSector / numOfFans) * 100;
            percentB = (bSector / numOfFans) * 100;
            percentV = (vSector / numOfFans) * 100;
            percentG = (gSector / numOfFans) * 100;

        }

        System.out.printf("%.2f%%\n", percentA);
        System.out.printf("%.2f%%\n", percentB);
        System.out.printf("%.2f%%\n", percentV);
        System.out.printf("%.2f%%\n", percentG);
        System.out.printf("%.2f%%\n", fansStadiumPercent);

    }
}
