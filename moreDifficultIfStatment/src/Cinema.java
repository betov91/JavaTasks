import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kindOfCinema = scanner.nextLine();
        int numLines = Integer.parseInt(scanner.nextLine());
        int numColumns = Integer.parseInt(scanner.nextLine());


        int totalSeats = numColumns * numLines;

        if (kindOfCinema.equals("Premiere")) {

            System.out.printf("%.2f leva", totalSeats * 12.0);
        } else if (kindOfCinema.equals("Normal")) {

            System.out.printf("%.2f leva", totalSeats * 7.50);
        } else if (kindOfCinema.equals("Discount")) {

            System.out.printf("%.2f leva", totalSeats * 5.0);
        }


    }

}
