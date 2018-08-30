import java.util.Scanner;

public class distance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double bothSides = a * (a / 2) * 2;
        double square = (a / 2) * (a / 2);
        double triangle = (a / 2 * (b - a / 2)) / 2;
        double backSide = square + triangle;
        double entrance = (a / 5) * (a / 5);
        double frontSide = backSide - entrance;
        double totalArea = bothSides + backSide + frontSide;
        double greenPaint = totalArea / 3;
        double roof = a * (a / 2) * 2;
        double redPaint = roof / 5;

        System.out.printf("%.2f\n", greenPaint);
        System.out.printf("%.2f", redPaint);


    }
}