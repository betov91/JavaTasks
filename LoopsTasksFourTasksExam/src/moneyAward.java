import java.util.Scanner;

public class moneyAward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partOfProjet = Double.parseDouble(scanner.nextLine());
        double awardPerPoint =Double.parseDouble(scanner.nextLine());

        double sumEven =0;
        double sumOdd = 0;
        double sumDiff = 0;
        double totalMoneyAward = 0;

        int numbersWithBonus = 0;

        for (int i = 1; i <= partOfProjet; i++) {

            double n =Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0 ){

             sumEven  +=   n * 2;

            }else{

                sumOdd += n;
            }

            sumDiff = sumEven + sumOdd;



        }

        totalMoneyAward = sumDiff *  awardPerPoint;


        System.out.printf("The project prize was %.2f lv.",totalMoneyAward);


    }

}
