import java.util.Scanner;

public class pets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numDays = Integer.parseInt(scanner.nextLine());
        double leftFood = Double.parseDouble(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtuleFood = Double.parseDouble(scanner.nextLine());

        double neededFood = Math.ceil((dogFood * numDays) + (catFood * numDays) + ((turtuleFood * 0.001) * numDays));


        if (neededFood <= leftFood) {

            double diff = (leftFood - neededFood);

            System.out.printf("%.0f kilos of food left.",diff );

        }else {

            double diff = (neededFood - leftFood);

            System.out.printf("%.0f more kilos of food are needed.", diff);


        }



    }

}
