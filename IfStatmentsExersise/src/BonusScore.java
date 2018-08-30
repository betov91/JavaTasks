import java.text.DecimalFormat;
import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.#");



        double inputUser = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (inputUser <= 100) {

            bonus = 5;

        } else if (inputUser >= 101 && inputUser <= 1000) {

            bonus = 0.20 * inputUser;

        } else if (inputUser >= 1001) {

             bonus = 0.10 * inputUser;
        }

        if (inputUser % 2 == 0) {

            bonus += 1;

        } else if (inputUser % 5 == 0) {

            bonus += 2;
        }

        System.out.println(format.format (bonus));
        System.out.println(format.format (inputUser + bonus));
    }


}

