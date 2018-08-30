import java.util.Scanner;

public class flowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceMagnolii = 3.25;
        double priceZumbuli = 4.00;
        double priceRozi = 3.50;
        double priceKaktusi = 8.00;


        double magnolii = Double.parseDouble(scanner.nextLine());
        double zumbuli = Double.parseDouble(scanner.nextLine());
        double rozi = Double.parseDouble(scanner.nextLine());
        double kaktusi = Double.parseDouble(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());


        double profit = (magnolii * 3.25) + (zumbuli * 4.00) + (rozi * 3.50) + (kaktusi * 8.00);
        double percent = profit * 0.05;
        double netProfit = profit - percent;

        if (netProfit < priceOfGift) {

            double diff = Math.abs(Math.floor(netProfit - priceOfGift));


            System.out.printf("She will have to borrow %.0f leva.", diff);
        }else {


            double diff = Math.abs(Math.floor(netProfit - priceOfGift));

            System.out.printf("She is left with %.0f leva.", diff);


        }


    }

}
