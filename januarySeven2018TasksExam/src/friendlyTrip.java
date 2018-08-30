import java.util.Scanner;

public class friendlyTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double km = Double.parseDouble(scanner.nextLine());
        double spendGasHundredKm = Double.parseDouble(scanner.nextLine());
        double priceOfGasLitter = Double.parseDouble(scanner.nextLine());
        double sumOfMoney = Double.parseDouble(scanner.nextLine());

        double gasNeeded = km * spendGasHundredKm / 100;
        double moneyforGasNeeded = priceOfGasLitter * gasNeeded;







        if (sumOfMoney >= moneyforGasNeeded) {

            double diff =  sumOfMoney - moneyforGasNeeded;


            System.out.printf("You can take a trip. %.2f money left.", diff);
        } else if (sumOfMoney < moneyforGasNeeded){

            double difference = moneyforGasNeeded = sumOfMoney;
            double split = difference / 5;


            System.out.printf("Sorry, you cannot take a trip. Each will receive %.2f money.",split );

        }


    }
}

