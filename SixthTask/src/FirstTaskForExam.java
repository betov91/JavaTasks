import java.util.Scanner;

public class FirstTaskForExam {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Number of tables: ");

        double numOfTables = Double.parseDouble(console.nextLine());



        System.out.print("Enter side length: ");
        double length = Double.parseDouble(console.nextLine());

        System.out.print("Enter side width: ");
        double width = Double.parseDouble(console.nextLine());




        double area = 0;
        double extraCover = 0;
        double cover = 0;
        double sideOfsmallSquare = 0;
        double smallSquare = 0;



        area = (length * width);
        extraCover = area * 0.30;
        cover = ((extraCover + area) * numOfTables) + smallSquare;


        sideOfsmallSquare = width / 2;
        smallSquare = sideOfsmallSquare * 4;
        System.out.println("Square metres for small square cover is " + smallSquare);

        System.out.println("Price per piece for small square cover in dolars: " + smallSquare * 7 + " $");
        System.out.println("Price per piece for small square cover in leva: " + smallSquare * (7 * 1.85) + " leva");



        System.out.println("Square metres cover for your tables: "+ cover);
        System.out.println("Price per piece for a table cover in dolars: " + cover * 9 + " $");
        System.out.println("Price per piece for a table cover in leva: " + cover * (9 * 1.85) + " leva");









    }

}
