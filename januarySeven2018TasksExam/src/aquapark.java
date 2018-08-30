import java.util.Scanner;

public class aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int hoursSpend = Integer.parseInt(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();


        String text1 = "Price per person for one hour:";
        String text2 = "Total cost of the visit:";

        double price = -1;
        double discount = 0;


        if ((month.equalsIgnoreCase("March") ||
                (month.equalsIgnoreCase("April") ||
                        (month.equalsIgnoreCase("May") ||
                                (month.equalsIgnoreCase("June")))))) {


            if (dayNight.equalsIgnoreCase("day")) {


                if (numOfPeople >= 4) {

                    price = 10.50 * 0.90;


                } else {
                    price = 10.50;

                }


            } else if (dayNight.equalsIgnoreCase("Night")) {


                if (numOfPeople >= 4) {

                    price =  8.4 * 0.90;


                } else {
                    price = 8.4;

                }

            }
        } else if ((month.equalsIgnoreCase("July") ||
                (month.equalsIgnoreCase("August")))) {


            if (dayNight.equalsIgnoreCase("day")) {

                if (numOfPeople >= 4) {

                    price = 12.60 * 0.90;


                } else {
                    price = 12.60;

                }


            } else if (dayNight.equalsIgnoreCase("Night")) {

                if (numOfPeople >= 4) {

                    //price = price * 0.90;
                    price = 10.20 * 0.90;


                } else {
                    price = 10.20;

                }

            }
        }


        if (hoursSpend >= 5) {

            price = price * 0.50;

        }


        double totalPrice = (price * numOfPeople) * hoursSpend;


        System.out.printf("%s %.2f%n %s %.2f", text1, price, text2, totalPrice);


    }}

