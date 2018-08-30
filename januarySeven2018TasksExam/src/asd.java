import java.util.Scanner;

public class asd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numOldPeople = Double.parseDouble(scanner.nextLine());
        double numOfStudents = Double.parseDouble(scanner.nextLine());
        double numOfNights = Double.parseDouble(scanner.nextLine());
        String typeofTransport = scanner.nextLine();


        double priceOld = 0;
        double priceStudents = 0;

        double hotelExpensis = numOfNights * 82.99;


        if (typeofTransport.equalsIgnoreCase("train")) {

            if ((numOldPeople + numOfStudents) >= 50) {


                priceOld = 24.99 / 2;
                priceStudents = 14.99 / 2;

                double totalPrice = ((priceOld * numOldPeople) + (priceStudents * numOfStudents)) * 2;

                double percentForTourOperator = (totalPrice + hotelExpensis) * 0.10;
                double totalSpend = ((totalPrice + hotelExpensis) + percentForTourOperator);

                System.out.printf("%.2f",totalSpend);


            } else {


            priceOld = 24.99;
            priceStudents = 14.99;

            double totalPrice = (((priceOld * numOldPeople) + (priceStudents * numOfStudents))) * 2;


            double percentForTourOperator = (totalPrice + hotelExpensis) * 0.10;
            double totalSpend = (totalPrice + hotelExpensis) + percentForTourOperator;
            System.out.printf("%.2f", totalSpend);}


        } else if (typeofTransport.equalsIgnoreCase("bus")) {



            priceOld = 32.50;
            priceStudents = 28.50;

            double totalPrice = (((priceOld * numOldPeople) + (priceStudents * numOfStudents))) * 2;

            double percentForTourOperator = (totalPrice + hotelExpensis) * 0.10;
            double totalSpend = (totalPrice + hotelExpensis) + percentForTourOperator;

            System.out.printf("%.2f", totalSpend);


        } else if (typeofTransport.equalsIgnoreCase("boat")) {




            priceOld = 42.99;
            priceStudents = 39.99;

            double totalPrice = (((priceOld * numOldPeople) + (priceStudents * numOfStudents))) * 2;

            double percentForTourOperator = (totalPrice + hotelExpensis) * 0.10;
            double totalSpend = (totalPrice + hotelExpensis) + percentForTourOperator;

            System.out.printf("%.2f", totalSpend);


        } else if (typeofTransport.equalsIgnoreCase("airplane")) {




            priceOld = 70.00;
            priceStudents = 50.00;

            double totalPrice = (((priceOld * numOldPeople) + (priceStudents * numOfStudents))) * 2;

            double percentForTourOperator = (totalPrice + hotelExpensis) * 0.10;
            double totalSpend = (totalPrice + hotelExpensis) + percentForTourOperator;


            System.out.printf("%.2f", totalSpend);
        }


    }

}
