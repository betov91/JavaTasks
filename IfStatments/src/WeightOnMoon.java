import java.util.Scanner;

public class WeightOnMoon {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weightOnEarth = 0;
        double weightOnMoon = 0;


        System.out.print("Enter weight on Earth: ");
        weightOnEarth = scanner.nextDouble();

        weightOnMoon = (weightOnEarth / 100) * 17;
        System.out.println("Weight on moon is: " + weightOnMoon + "kg");
















    }
}