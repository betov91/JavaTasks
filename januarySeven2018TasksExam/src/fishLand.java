import java.util.Scanner;

public class fishLand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double skumriqKgPrice = Double.parseDouble(scanner.nextLine());
        double cacaKgPrice = Double.parseDouble(scanner.nextLine());
        double palamutKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());


        double palamutPrice = skumriqKgPrice + skumriqKgPrice * 0.60;
        double safridPrice = cacaKgPrice + cacaKgPrice *0.80;
        double midiPrice = 7.50;

        double palamutTotal = palamutPrice * palamutKg;
        double safridTotal = safridPrice * safridKg;
        double midiTotal = midiPrice * midiKg;

        double totalMoneyNeeded = palamutTotal + safridTotal + midiTotal;

        System.out.printf("%.2f", totalMoneyNeeded);


    }
}