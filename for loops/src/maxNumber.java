import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  n = scanner.nextInt();

        int maxNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int number = scanner.nextInt();

            if (number < maxNum) {

                maxNum = number;

                System.out.println(maxNum);

            }



        }

    }

}
