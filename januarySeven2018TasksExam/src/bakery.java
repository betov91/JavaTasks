import java.util.Scanner;

public class bakery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  totalDough = Double.parseDouble(scanner.nextLine());
        double  weightBreadUnit = Double.parseDouble(scanner.nextLine());
        double  priceOfBreadUnit = Double.parseDouble(scanner.nextLine());
        double  saleBreadUnits = Double.parseDouble(scanner.nextLine());
        double  saleSweetUnits = Double.parseDouble(scanner.nextLine());

        double dayIncome = saleBreadUnits * priceOfBreadUnit;
        double doughNeeded = weightBreadUnit * saleBreadUnits;
        double leftOverDough = totalDough -  doughNeeded;
        double priceOfSweet = priceOfBreadUnit * 1.25;
        double weightOfSweet = weightBreadUnit * 0.80;
        double sweetDoughUsed = saleSweetUnits * weightOfSweet;
        double nightIncome = saleSweetUnits * priceOfSweet;
        double priceOfSpendDough =  (totalDough + (totalDough - leftOverDough)) * 0.004;
        double netSalary = (dayIncome + nightIncome) - priceOfSpendDough;
        double totalUsedDough = doughNeeded + sweetDoughUsed;

        String text1 = "Pure income:";
        String text2 = "Dough used:";
        String text3 = "lv.";
        String text4 = "g.";

        System.out.printf("%s %.2f %s%n", text1, netSalary,text3);
        System.out.printf("%s %.0f %s", text2, totalUsedDough, text4);





    }
}
