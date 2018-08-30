import java.util.Scanner;

public class matchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int numOfPeople = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        double  shuttle = 0;
        double leftover = 0;
        String positive = "Yes! You have";
        String positiveTail = "leva left.";
        String negative = "Not enough money! You need";
        String nagativeTail = "leva.";



        if (type.equals("VIP")){

            ticketPrice = 499.99;
        }else {
            ticketPrice = 249.99;
        }

        if (numOfPeople >= 1 && numOfPeople <= 4){

            shuttle = budget * 0.75;

            }else  if (numOfPeople >= 5 && numOfPeople <= 9){

            shuttle = budget * 0.60;

        } if (numOfPeople >= 10 && numOfPeople <= 24){

            shuttle = budget * 0.50;

        } if (numOfPeople >= 25 && numOfPeople <= 49){

            shuttle = budget * 0.40;

        } if (numOfPeople > 49){

            shuttle = budget * 0.25;

        }

    if (budget >= (ticketPrice * numOfPeople + shuttle)){

            leftover = budget - (ticketPrice * numOfPeople) - shuttle;

        System.out.printf("%s %.2f %s",positive,leftover, positiveTail);

    }else {

        leftover = Math.abs(budget - (ticketPrice * numOfPeople) - shuttle);

        System.out.printf("%s %.2f %s",negative,leftover, nagativeTail);

    }


    }

}
