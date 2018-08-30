
import java.text.DecimalFormat;
import java.util.Scanner;

public class InchesToSantimeteres {

    private static DecimalFormat df2 = new DecimalFormat(".##");


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cm = scanner.nextDouble();

        double inch = cm * 2.54;

        System.out.println(inch);


    }

}
