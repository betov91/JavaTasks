import java.util.Scanner;

public class triangleWith$ {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {

            System.out.print("$");

            for (int col = 0; col < row; col++) {

                System.out.print(" $");


            }
            System.out.println();
        }

    }


}
