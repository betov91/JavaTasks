import java.util.Scanner;

public class delenieBezOstatuk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n = Double.parseDouble(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        double percent1 = 0;
        double percent2 = 0;
        double percent3 = 0;

        for (int i = 0; i < n ; i++) {

           double number = Double.parseDouble(scanner.nextLine());



            if ( number % 2 == 0){

            p1 = 1;
            sum1 += p1;
            percent1 =( sum1 * 100) / n;



            }

            if  (number % 3 == 0){

                p2 = 1;
                sum2 += p2;
                percent2 =( sum2 * 100) / n;




            }

            if (number % 4 == 0){

                p3 = 1;
                sum3 += p3;
                percent3 =( sum3 * 100) / n;



            }

        }
        System.out.printf("%.2f%%\n", percent1);
        System.out.printf("%.2f%%\n", percent2);
        System.out.printf("%.2f%%\n", percent3);

    }


}
