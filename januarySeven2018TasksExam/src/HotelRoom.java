import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceFlat = 0;


        if (month.equalsIgnoreCase("May") || (month.equalsIgnoreCase("October"))){

            priceStudio = 50;
            priceFlat = 65;

            if (nights > 7) {

                priceStudio = 50 * 0.95;

            }

            if (nights > 14){

                priceStudio = 50 * 0.70;

            }

            if (nights > 14){

                priceFlat = 65 * 0.90;
            }






        }else if (month.equalsIgnoreCase("June") || (month.equalsIgnoreCase("September"))){

            priceStudio = 75.20;
            priceFlat = 68.70;

            if (nights > 14){

                priceStudio = 75.20 * 0.80;
                priceFlat = 68.70 * 0.90;

            }

        }else if (month.equalsIgnoreCase("July") || (month.equalsIgnoreCase("August"))){

            priceStudio = 76;
            priceFlat = 77;

            if (nights > 14){

                priceFlat = 77 * 0.90;
            }
        }

         double totalPriceFlat = priceFlat * nights;
        double totalPriceStudio = priceStudio * nights;




        System.out.printf("Apartment: %.2f lv.%n" +
                "Studio: %.2f lv. ", totalPriceFlat, totalPriceStudio);

    }

}
