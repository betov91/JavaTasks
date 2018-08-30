import java.util.Scanner;

public class ConvertorOfUnitMeasures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double m = 1;
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;

        double num = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();



        if (from.equals("m")) {
            num /= m;
        } else if (from.equals("mm")) {
            num /= 1000;
        } else if (from.equals("cm")) {
            num /= 100;
        } else if (from.equals("mi")) {
            num /= 0.000621371192;
        } else if (from.equals("in")) {
            num /= 39.3700787;
        } else if (from.equals("km")) {
            num /= 0.001;
        } else if (from.equals("ft")) {
            num /= 3.2808399;
        } else if (from.equals("yd")) {
            num /= 1.0936133;
        }


        if (to.equals("m")) {
            num *= 1;
        } else if (to.equals("mm")) {
            num *= 1000;
        } else if (to.equals("cm")) {
           num *= 100;
        } else if (to.equals("mi")) {
            num *= 0.000621371192;
        } else if (to.equals("in")) {
            num *= 39.3700787;
        } else if (to.equals("km")) {
            num *= 0.001;
        } else if (to.equals("ft")) {
            num *= 3.2808399;
        } else if (to.equals("yd")) {
            num *= 1.0936133;
        }


        System.out.printf("%.8f %s %n", num, to );

        }
}





