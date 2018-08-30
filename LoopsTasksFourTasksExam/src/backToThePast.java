import java.util.Scanner;

public class backToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        double yearToLiveUpTo = Double.parseDouble(scanner.nextLine());


        double ivanYears = 18;
        double evenYearMoneySpend = 12_000;
        double sumEven = 0;
        double sumOdd = 0;
        double count = 0;
        double diff = 0;
        double diff1 = 0;


        for (int i = 1800; i <= yearToLiveUpTo; i++) {

            if (i % 2 == 0) {

                sumEven += evenYearMoneySpend;

            } else {

                count++;

                sumEven += evenYearMoneySpend + (50 * (17 + count * 2 ));
            }

        }
        double totalSum = sumEven + sumOdd;


        if (totalSum <= inheritedMoney) {

            diff = inheritedMoney - totalSum;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);

        } else {

             diff1 = totalSum - inheritedMoney;

            System.out.printf("He will need %.2f dollars to survive.", diff1);

        }

    }
}

