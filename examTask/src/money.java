import java.util.Scanner;

public class money {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double bitcoin = Double.parseDouble(scanner.nextLine());
        double cun = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double btc = 1168;
        double chineseUan = 0.15;
        double usd = 1.76;
        double euro = 1.95;

        double sumBtc = bitcoin * btc;

        double sumCun = cun * chineseUan;

        double sumCunLeva = sumCun * usd;

        double totalSum = (sumBtc + sumCunLeva) / euro;

        double percent = comission * 0.01;

        double percentTotal = totalSum * percent;


        double percentReal = totalSum - percentTotal;


        System.out.printf("%.2f", percentReal);


    }
}
