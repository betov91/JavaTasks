import java.util.Scanner;

public class smartLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double liliYears = Double.parseDouble(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        double priceOfToy = Double.parseDouble(scanner.nextLine());


        double moneyEvenYear = 0;
        double moneyExtra = 10;
        double toyMinusOne = 0;
        double moneyOddYear = 0;
        double sum = 0;
        double sum1 = 0;
        double countSteels =0;


        for (int i = 1; i <= liliYears; i++) {


            if (i % 2 == 0) {


                moneyEvenYear += (i * 10) / 2; ;
                countSteels++;


            } else {

               moneyOddYear++;


            }


        }

        sum1 = moneyOddYear * priceOfToy;
        sum = moneyEvenYear + sum1 - countSteels;

        if (sum >= priceOfWashingMachine){


           double diff = sum - priceOfWashingMachine;


            System.out.printf("Yes! %.2f", diff);


        }else {

            double diff = priceOfWashingMachine - sum;


            System.out.printf("No! %.2f", diff);


        }


    }

}
