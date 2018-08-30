import java.util.Scanner;

public class sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthA = Double.parseDouble(scanner.nextLine());
        double lengthB = Double.parseDouble(scanner.nextLine());
        double priceOfSand = Double.parseDouble(scanner.nextLine());
        double priceOfPlank = Double.parseDouble(scanner.nextLine());



        double sandArea= (widthA -(0.2 + 0.2)) * (lengthB - (0.2 + 0.2));
        double totalArea = (widthA * lengthB) - sandArea;
        double neededSand = Math.ceil(20 * sandArea);
        double neededPlanks =Math.ceil(totalArea / (2.20 *0.20));
        double totalPriceSand = priceOfSand * neededSand ;
        double totalPricePlank = priceOfPlank * neededPlanks;
        double totalPriceOfBoth = totalPricePlank + totalPriceSand;


        System.out.printf("%.2f", totalPriceOfBoth);




    }
}
