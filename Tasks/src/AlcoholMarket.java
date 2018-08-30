import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfWiscky = Double.parseDouble(scanner.nextLine());
        double literOfBeer = Double.parseDouble(scanner.nextLine());;
        double literOfWine = Double.parseDouble(scanner.nextLine());
        double literOfRakia = Double.parseDouble(scanner.nextLine());
        double literOfWiscky = Double.parseDouble(scanner.nextLine());

        double priceOfRakia = priceOfWiscky / 2;
        double priceOfWine = priceOfRakia - (0.4 * priceOfRakia);
        double priceOfBeer = priceOfRakia - (0.8 * priceOfRakia);

        double rakiaInTotal = literOfRakia * priceOfRakia;
        double wineInTotal = literOfWine * priceOfWine;
        double beerInTotal = literOfBeer * priceOfBeer;
        double wisckyInTotal = priceOfWiscky * literOfWiscky;


        double result = rakiaInTotal + wineInTotal + beerInTotal + wisckyInTotal;

        System.out.printf("%.2f", result);
        }

}
