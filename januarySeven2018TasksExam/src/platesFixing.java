import java.util.Scanner;

public class platesFixing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideOfSquare = Double.parseDouble(scanner.nextLine());
        double wightPlate = Double.parseDouble(scanner.nextLine());
        double lenghtPlate = Double.parseDouble(scanner.nextLine());
        double wBench = Double.parseDouble(scanner.nextLine());
        double lBench = Double.parseDouble(scanner.nextLine());

        double squareArea = sideOfSquare * sideOfSquare;
        double areaOfBench = wBench * lBench;
        double plateArea = lenghtPlate * wightPlate;
        double areaForPlating = squareArea - areaOfBench;
        double plateNeeded = areaForPlating / plateArea;
        double neededTimeForPlating = plateNeeded * 0.2;


        System.out.printf("%.2f%n%.2f",plateNeeded, neededTimeForPlating);


    }

}
