import java.util.Scanner;

public class squareFrame {


    private static String repeat(String string, int count) {
            String output = "";

            for (int i = 0; i < count; i++) {
                output += string;
            }

            return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("+ ");

        for (int i = 0; i < n - 2; i++) {

            System.out.print("- ");
        }
        System.out.println("+");


        for (int i = 0; i < n -2 ; i++) {

            System.out.print("| ");

            for (int j = 0; j < n - 2; j++) {

                System.out.print("- ");

            }
            System.out.println("|");

        }

        System.out.print("+ ");

        for (int i = 0; i < n - 2; i++) {

            System.out.print("- ");
        }
        System.out.println("+");

    }
}
