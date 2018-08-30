import java.util.Scanner;

public class bikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double junior = Double.parseDouble(scanner.nextLine());
        double senior = Double.parseDouble(scanner.nextLine());
        String typeOftrace = scanner.nextLine();


        double priceJunior = 0;
        double priceSenior = 0;



        if (typeOftrace.equalsIgnoreCase("trail")){

             priceJunior = 5.50;
             priceSenior = 7.00;

        } else  if (typeOftrace.equalsIgnoreCase("cross-country")){

              priceJunior = 8.00;
              priceSenior = 9.50;

              if ((junior + senior) >= 50){

                  priceJunior = 8.00 * 0.75;
                  priceSenior = 9.50 * 0.75;


              }

        }else  if (typeOftrace.equalsIgnoreCase("downhill")){

               priceJunior = 12.25;
               priceSenior = 13.75;

        }else  if (typeOftrace.equalsIgnoreCase("road")){

             priceJunior = 20.00;
             priceSenior = 21.50;

        }



        double percent = ((junior * priceJunior) + (senior * priceSenior)) * 0.05;
        double sum = (junior * priceJunior) + (senior * priceSenior) - percent;

        System.out.printf("%.2f", sum);



    }

}
