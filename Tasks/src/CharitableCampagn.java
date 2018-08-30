import java.util.Scanner;

public class CharitableCampagn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        double numOfDays = Double.parseDouble(scanner.nextLine());
        double numOfPeople = Double.parseDouble(scanner.nextLine());
        double numOfCakes = Double.parseDouble(scanner.nextLine());
        double numOfWaffles = Double.parseDouble(scanner.nextLine());
        double numOfPancakes = Double.parseDouble(scanner.nextLine());

        double cakes = numOfCakes * 45;
        double waffles = numOfWaffles * 5.80;
        double pancakes = numOfPancakes * 3.20;

        double sumForAday = (cakes + waffles + pancakes) * numOfPeople;
        double sumForAllTime = sumForAday * numOfDays;
        double afterExpenses = sumForAllTime / 8;
        double afterExpenses1 = sumForAllTime - afterExpenses;

        System.out.printf("%.2f",afterExpenses1);





    }

}
