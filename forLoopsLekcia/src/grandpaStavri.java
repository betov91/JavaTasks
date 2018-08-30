import java.util.Scanner;

public class grandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numDays = Double.parseDouble(scanner.nextLine());

        double littersTotal = 0;
        double liters = 0;
        double sum = 0;
        double sumSum = 0;


        for (int i = 0; i < numDays; i++) {

            double quantityOfGrapa = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());

            littersTotal += quantityOfGrapa;

            sum = sum + quantityOfGrapa * degrees;

            sumSum = sum / littersTotal;


        }
        System.out.printf("Liter: %.2f\n",littersTotal);
        System.out.printf("Degrees: %.2f\n", sumSum);


        if (sumSum >= 38 && sumSum <=42){

            System.out.print("Super!");



        }else if (sumSum < 38){

            System.out.print("Not good, you should baking!");



        }else if (sumSum > 42){
            System.out.println("Dilution with distilled water!");


        }


    }


}
