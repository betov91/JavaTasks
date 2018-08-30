import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        double hrizantemi = Double.parseDouble(scanner.nextLine());
        double rozi = Double.parseDouble(scanner.nextLine());
        double laleta = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String praznikIliNe = scanner.nextLine();

        double priceHrizantemi = 0;
        double priceRozi = 0;
        double priceLaleta = 0;
        double totalSum = 0;


        if (season.equalsIgnoreCase("summer") || ((season.equalsIgnoreCase("spring")))) {


            if (praznikIliNe.equalsIgnoreCase("Y")) {


                if (rozi > 7 && ((season.equalsIgnoreCase("spring")))) {


                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;

                    double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                    double discount = sum * 0.05;
                    double percentage = sum * 0.15;

                    totalSum = (sum + percentage) - discount;

                    System.out.printf("%.2f", totalSum);


                } else if (hrizantemi + rozi + laleta > 20) {

                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;

                    double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                    double discount = sum * 0.05;
                    double percentage = sum * 0.15;

                    totalSum = (sum + percentage) - discount;

                    System.out.printf("%.2f", totalSum);


                } else if ((hrizantemi + rozi + laleta < 20) && (rozi > 7 && ((season.equalsIgnoreCase("spring"))))) {

                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;

                    double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);


                    System.out.printf("%.2f", sum);


                }


            } else if (praznikIliNe.equalsIgnoreCase("N")) {

                if (rozi > 7 && ((season.equalsIgnoreCase("spring")))) {


                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;

                    double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                    double discount = sum * 0.05;
                    double percentage = sum * 0.15;

                    totalSum = sum - discount;

                    System.out.printf("%.2f", totalSum);


                } else if (hrizantemi + rozi + laleta > 20) {

                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;

                    double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                    double discount = sum * 0.20;
                    double percentage = sum * 0.15;

                    totalSum = sum - discount;

                    System.out.printf("%.2f", totalSum);


                } else if (season.equalsIgnoreCase("autumn") || ((season.equalsIgnoreCase("winter")))) {


                    if (praznikIliNe.equalsIgnoreCase("Y")) {

                        if (hrizantemi >= 10 && ((season.equalsIgnoreCase("winter")))) {


                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                            double discount = sum * 0.20;
                            double percentage = sum * 0.15;

                            totalSum = (sum + percentage) - discount;


                            System.out.printf("%.2f", totalSum);


                        } else if (hrizantemi + rozi + laleta > 20) {

                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                            double discount = sum * 0.10;
                            double percentage = sum * 0.15;

                            totalSum = (sum + percentage) - discount;

                            System.out.printf("%.2f", totalSum);


                        } else if ((hrizantemi + rozi + laleta < 20) && (hrizantemi < 10 && ((season.equalsIgnoreCase("winter"))))) {

                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                            double percentage = sum * 0.15;
                            double sumPercentage = sum + percentage;

                            System.out.printf("%.2f", sumPercentage);


                        }
                    } else if (praznikIliNe.equalsIgnoreCase("N")) {

                        if (hrizantemi >= 10 && ((season.equalsIgnoreCase("winter")))) {


                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                            double discount = sum * 0.10;
                            double percentage = sum * 0.15;

                            totalSum = sum - discount;

                            System.out.printf("%.2f", totalSum);


                        } else if (hrizantemi + rozi + laleta > 20) {

                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);
                            double discount = sum * 0.20;
                            double percentage = sum * 0.15;

                            totalSum = sum - discount;


                            System.out.printf("%.2f", totalSum);


                        } else if ((hrizantemi + rozi + laleta < 20) && (hrizantemi < 10 && ((season.equalsIgnoreCase("winter"))))) {

                            priceHrizantemi = 3.75;
                            priceRozi = 4.50;
                            priceLaleta = 4.15;

                            double sum = (hrizantemi * priceHrizantemi) + (rozi * priceRozi) + (laleta * priceLaleta);


                            System.out.printf("%.2f", sum);


                        }
                    }


                }


            }
        }

    }}