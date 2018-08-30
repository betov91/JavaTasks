import java.util.Scanner;

public class examTaskTransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          double km  = Double.parseDouble(scanner.nextLine());
          String dayNight = scanner.nextLine();


          double priceOfTransport = 0;





          if (km < 20){


              if (dayNight.equals("day")){

              priceOfTransport = 0.70 + (0.79 * km);
              }else {

                  priceOfTransport = 0.70 + (0.90 * km);

              }


          }else if (km >= 20 && km < 100){

              priceOfTransport = km *  0.09;

          }else if (km >=100){

              priceOfTransport = km *  0.06;


          }

        System.out.printf("%.2f", priceOfTransport);

    }

}
