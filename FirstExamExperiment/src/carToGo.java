import java.util.Scanner;

public class carToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        double price = 0;
        String clas = "";
        String coupeCar = "";


        if (budget <= 100) {

            clas = "Economy class";


            if (season.equalsIgnoreCase("summer")) {

                coupeCar = "Cabrio";
                price = budget * 0.35;

            } else if (season.equalsIgnoreCase("winter")) {

                coupeCar = "Jeep";
                price = budget * 0.65;

            }

        } else if (budget > 100 && budget <= 500) {

            clas = "Compact class";


            if (season.equalsIgnoreCase("summer")) {

                coupeCar = "Cabrio";

                price = budget * 0.45;

            } else if (season.equalsIgnoreCase("winter")) {

                coupeCar = "Jeep";

                price = budget * 0.80;


            }
        } else if (budget > 500) {

            clas = "Luxury class";

            coupeCar = "Jeep";

            price = budget * 0.90;


        }

        System.out.printf("%s\n%s - %.2f", clas, coupeCar, price);


    }


}