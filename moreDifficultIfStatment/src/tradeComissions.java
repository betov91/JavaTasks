import java.util.Scanner;

public class tradeComissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());


        double percentage = -1;


        if (city.equals("Sofia")) {

            if (sales >= 0 && sales <= 500) {

                percentage = 0.05;

            } else if (sales > 500 && sales <= 1000) {

                percentage = 0.07;

            } else if (sales > 1000 && sales <= 10000) {

                percentage = 0.08;

            } else if (sales > 10000) {

                percentage = 0.12;

            }
        } else if (city.equals("Varna")) {

            if (sales >= 0 && sales <= 500) {

                percentage = 0.045;

            } else if (sales > 500 && sales <= 1000) {

                percentage = 0.075;

            } else if (sales > 1000 && sales <= 10000) {

                percentage = 0.10;

            } else if (sales > 10000) {

                percentage = 0.13;

            }
        } else if (city.equals("Plovdiv")) {

            if (sales >= 0 && sales <= 500) {

                percentage = 0.055;

            } else if (sales > 500 && sales <= 1000) {

                percentage = 0.08;

            } else if (sales > 1000 && sales <= 10000) {

                percentage = 0.12;

            } else if (sales > 10000) {

                percentage = 0.145;

            }

        }

        if (percentage <= -1) {

            System.out.println("error");

        } else {
            System.out.printf("%.2f", sales * percentage);

        }


    }


}






