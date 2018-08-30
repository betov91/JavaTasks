
import java.util.Scanner;

public class pcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dolar = 1.57;

        double procesorPrice = Double.parseDouble(scanner.nextLine());
        double videoCartPrice = Double.parseDouble(scanner.nextLine());
        double ramPriceForOne = Double.parseDouble(scanner.nextLine());
        double ramPriceForAll = Double.parseDouble(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double procesorPriceLeva = procesorPrice * dolar;
        double videoCartLeva = videoCartPrice * dolar;
        double ramPriceOneLeva = ramPriceForOne * dolar;
        double totalPricePerRam = ramPriceOneLeva * ramPriceForAll;
        double procerLevaDiscount = procesorPriceLeva * percentDiscount;
        double procerLevaWithDiscount = procesorPriceLeva - procerLevaDiscount;
        double videoCartDiscount = videoCartLeva * percentDiscount;
        double videoCartAferDiscount = videoCartLeva - videoCartDiscount;

        double toralPriceConfiguration = procerLevaWithDiscount + videoCartAferDiscount + totalPricePerRam;


        System.out.printf("Money needed - %.2f leva.", toralPriceConfiguration);

    }
}