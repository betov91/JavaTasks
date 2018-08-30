import java.util.Scanner;

public class bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double month = Double.parseDouble(scanner.nextLine());

        double water = 20;
        double net = 15;
        double sumElectryc = 0;

        double waterInTotal = water * month;
        double netTotal = net * month;



        for (int i = 1; i <= month; i++) {

            double billsElectric = Double.parseDouble(scanner.nextLine());
             sumElectryc += billsElectric;


        }


        double other = (waterInTotal + netTotal+ sumElectryc) * 1.20;
        double averageMonth = (sumElectryc + waterInTotal + netTotal + other) /month;



        System.out.printf("Electricity: %.2f lv\n",sumElectryc);
        System.out.printf("Water: %.2f lv\n",waterInTotal);
        System.out.printf("Internet: %.2f lv\n",netTotal);
        System.out.printf("Other: %.2f lv\n",other);
        System.out.printf("Average: %.2f lv\n",averageMonth);



    }

}
