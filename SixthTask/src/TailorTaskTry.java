import java.util.Scanner;

public class TailorTaskTry {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double coverSquareMeter = num * (length + 2 * 0.30) * (width + 2 * 0.30);
        System.out.println(coverSquareMeter);

        double smallCoverMeter = num * (length / 2) * (length / 2);
        System.out.println(smallCoverMeter);


    }
}
