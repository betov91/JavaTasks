import java.util.Scanner;

        public class CelsisusToFahrenheit {

            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                double cel = Double.parseDouble(scanner.nextLine());

                double fah = 0;

                fah = 1.8 * cel + 32;

                System.out.printf("%.2f", fah);

            }

            }