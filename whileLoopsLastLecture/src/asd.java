import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trainDays = Double.parseDouble(scanner.nextLine());
        double numDancers = Double.parseDouble(scanner.nextLine());

        double spendEnergy1 = 0;
        double spendEnergy2 = 0;
        double spendEnergy3 = 0;
        double spendEnergy4 = 0;

        double sum = 0;

        double totalEnergy = 100 * numDancers * trainDays;



        for (double i = 1; i <= trainDays; i++) {

            double hoursDance = Double.parseDouble(scanner.nextLine());

            if (trainDays % 2 == 0 &&  hoursDance % 2 == 0 ){

                spendEnergy1 = 68 * numDancers;
                sum += spendEnergy1;


            }else  if (trainDays % 2 != 0 &&  hoursDance % 2 == 0 ){

                spendEnergy2 = 49 * numDancers;
                sum += spendEnergy2;


            }else  if (trainDays % 2 == 0 &&  hoursDance % 2 != 0 ){

                spendEnergy3 = 65 * numDancers;
                sum += spendEnergy3;


            }else  if (trainDays % 2 != 0 &&  hoursDance % 2 != 0 ){

                spendEnergy4 = 30 * numDancers;
                sum += spendEnergy4;


            }


        }



        double result = totalEnergy - sum;
        double percent = result / numDancers / trainDays;


        if (percent <= 50){

            System.out.println("They feel good! Energy left: " + percent);

        }else {

            System.out.println("They are wasted! Energy left: " + percent);

        }



    }

}
