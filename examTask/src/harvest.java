import java.util.Scanner;

public class harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double squareMeterLoze = Double.parseDouble(scanner.nextLine());
        double grapeForSquareMeter = Double.parseDouble(scanner.nextLine());
        double neededWine = Double.parseDouble(scanner.nextLine());
        double numWorkers = Double.parseDouble(scanner.nextLine());


        double totalGrape = squareMeterLoze * grapeForSquareMeter;
        double grapeForWinePercent = totalGrape * 0.40;
        double grapeForWine = (grapeForWinePercent / 2.5);

        if (grapeForWine >= neededWine) {

            double diff = Math.ceil(grapeForWine - neededWine);
            double wineForWorker = Math.ceil(diff / numWorkers);
            grapeForWine = Math.floor(grapeForWine);

            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", grapeForWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", diff, wineForWorker);


        } else{

            double diff = Math.floor(neededWine - grapeForWine);


            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);


        }


    }

}
