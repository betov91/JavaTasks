import java.util.Scanner;

public class housePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaSmallestRoom = Double.parseDouble(scanner.nextLine());
        double areaOfKitchen = Double.parseDouble(scanner.nextLine());
        double priceOfSquareMeter = Double.parseDouble(scanner.nextLine());


        double bathroom = areaSmallestRoom / 2;
        double secondRoom = areaSmallestRoom * 1.10;
        double turdRoom = secondRoom * 1.10;
        double coridor = (areaSmallestRoom + areaOfKitchen + bathroom + secondRoom + turdRoom) * 0.05;

        double totalSquareMeters = coridor + (areaSmallestRoom + areaOfKitchen + bathroom + secondRoom + turdRoom);
        double priceOfTheApartment = totalSquareMeters * priceOfSquareMeter;

        System.out.printf("%.2f", priceOfTheApartment);


    }

}
