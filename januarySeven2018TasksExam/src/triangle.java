import java.text.DecimalFormat;
import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimalFormat = new DecimalFormat("0.#");

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());



        if (((a < b + c) && (b < a + c) && c < a + b)){



            if ((a == b) && (b == c)) {
                System.out.print("Triangle with sides ");
                System.out.print(decimalFormat.format(a));
                System.out.print(", ");
                System.out.print(decimalFormat.format(b));
                System.out.print(" and ");
                System.out.print(decimalFormat.format(c));
                System.out.print(" is equilateral.");


            } else if ((c != a && a == b) ||  (a != b && a == c) || (a != b && c == b)){
                System.out.print("Triangle with sides ");
                System.out.print(decimalFormat.format(a));
                System.out.print(", ");
                System.out.print(decimalFormat.format(b));
                System.out.print(" and ");
                System.out.print(decimalFormat.format(c));
                System.out.print(" is isosceles.");


            } else if ((a < b + c) && (b < a + c) && (c < a + b) && (a != b) && b != c) {
                System.out.print("Triangle with sides ");
                System.out.print((decimalFormat.format(a)));
                System.out.print(", ");
                System.out.print(decimalFormat.format(b));
                System.out.print(" and ");
                System.out.print(decimalFormat.format(c));
                System.out.print(" is scalene.");

            }} else {

            System.out.print("There is no triangle with sides ");
            System.out.print(decimalFormat.format(a));
            System.out.print(", ");
            System.out.print(decimalFormat.format(b));
            System.out.print(" and ");
            System.out.print(decimalFormat.format(c));
            System.out.print(".");



        }
    }
}