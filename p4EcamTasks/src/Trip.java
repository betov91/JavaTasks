import java.util.Scanner;

public class Trip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();


        String bg = "Somewhere in Bulgaria";
        String bal = "Somewhere in Balkans";
        String eu = "Somewhere in Europe";
        String summerCamp = "Camp";
        String winterHotel = "Hotel";

        double percentage = 0;


// trip in Bulgaria
        if (budget <= 100) {
            System.out.println(bg);

            if (season.equals("summer")) {

                percentage = budget * 0.30;

                System.out.printf("%s - %.2f", summerCamp, percentage);


            } else if ((season.equals("winter"))) {


                percentage = budget * 0.70;

                System.out.printf("%s - %.2f", winterHotel, percentage);
// trip in Balkans
            }} else if (budget > 100 && budget <= 1000) {
                System.out.println(bal);

                if (season.equals("summer")) {

                    percentage = budget * 0.40;

                    System.out.printf("%s - %.2f", summerCamp, percentage);


                } else if ((season.equals("winter"))) {


                    percentage = budget * 0.80;

                    System.out.printf("%s - %.2f", winterHotel, percentage);

                }
//trip in Europe
            }else if (budget > 1000){

               percentage = budget *0.90;

                System.out.println(eu);

                if (season.equals("summer")) {

                    percentage = budget * 0.90;

                    System.out.printf("%s - %.2f", winterHotel, percentage);


                } else if ((season.equals("winter"))) {


                    percentage = budget * 0.90;

                    System.out.printf("%s - %.2f", winterHotel, percentage);
            }

        }

    }
}