import java.util.Scanner;

public class BoleanTask {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        double base = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter base of trapezoid: ");
        base = scanner.nextDouble();

        System.out.print("Enter height of trapezoid: ");
        height = scanner.nextDouble();



        area = (base * height) / 2;
        System.out.print("Area: " + area);



    }
}
