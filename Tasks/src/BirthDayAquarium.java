
//import java.text.DecimalFormat;
import java.util.Scanner;

public class BirthDayAquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // DecimalFormat decimalFormat = new DecimalFormat("#.###");



        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = height * width * length;

        double littersInTotal = volume * 0.001;
        double percentResult = percent * 0.01;


        double litersInUse = littersInTotal * (1 - percentResult);

        System.out.printf("%.3f", litersInUse);

        //System.out.println(decimalFormat.format(litersInUse));

        }

}
