import java.util.Scanner;

public class addFefteenMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        int sum = (hour * 60) + min + 15;
        int resulthour = sum / 60;
        if (resulthour >= 24) {

            resulthour -= 24;
        }
        int resultmin = sum % 60;
        if (resultmin < 9) {
            System.out.print(resulthour + ":" + "0" + resultmin);


        } else {
            System.out.println(resulthour + ":" + resultmin);
        }

        // System.out.print(resulthour);
        // System.out.print(resultmin);
    }
}
