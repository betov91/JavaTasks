import java.util.Scanner;

public class workout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numDays = Double.parseDouble(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        double kmPercentTotal = km;


        for (int i = 0; i < numDays ; i++) {

            double percentEnhance =Double.parseDouble(scanner.nextLine());

            km *= 1 + percentEnhance / 100.0;

            kmPercentTotal += km;

            }

        if (kmPercentTotal < 1000){

            double diff = Math.ceil(1000 - kmPercentTotal);

            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",diff);

        }else {


            double diff = Math.ceil(kmPercentTotal - 1000);

            System.out.printf("You've done a great job running %.0f more kilometers!",diff);

        }


        }




    }


