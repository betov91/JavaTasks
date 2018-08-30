import java.util.Scanner;

public class Inches {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inches = ");
        Double inches = scanner.nextDouble();
        Double centimeters = inches * 2.54;

        System.out.print("Cantimetres = ");
        System.out.println(centimeters);


    }

}
