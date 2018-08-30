import java.text.DecimalFormat;
import java.util.Scanner;

public class TrailorWorkshop {

    private static DecimalFormat df2 = new DecimalFormat(".##");



    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        int num = Integer.parseInt(console.nextLine());


        double length = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());


        double coverSquareMeter = num * (length + 2 * 0.30) * (width + 2 * 0.30);

        double smallCoverMeter = num * (length / 2) * (length / 2);

        double result = coverSquareMeter * 7 + smallCoverMeter * 9;
        double result1 =  coverSquareMeter * (7 * 1.85) + (smallCoverMeter * 9 * 1.85);

        System.out.println( df2.format(result) + " USD");
        System.out.println(  df2.format(result1) + " BGN");


    }
}


