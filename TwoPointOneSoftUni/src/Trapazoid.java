import java.util.Scanner;

public class Trapazoid {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a side of Trapazoid: ");

        Double b1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a side of Trapazoid: ");


        Double b2 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter a height: ");

        Double h = Double.parseDouble(scanner.nextLine());

        Double area = (b1 + b2) * h / 2.0;

        System.out.println("Trapezoid = " + area);



    }
}
