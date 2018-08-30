import java.util.Scanner;

public class sumOfSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstCompetitor = Integer.parseInt(scanner.nextLine());
        int secondCompetitor = Integer.parseInt(scanner.nextLine());
        int thirdCompetitor = Integer.parseInt(scanner.nextLine());

        int result = firstCompetitor + secondCompetitor + thirdCompetitor;

        int min = 0;

        if (result > 59 && result < 120) {

            min = 1;
            result -= 60;


        } else if (result > 119 && result < 180) {

            min = 2;
            result -= 120;

        }
        if (result < 9) {
            System.out.print(min + ":" + "0" + result);


        } else {
            System.out.println(min + ":" + result);
        }
    }

}
