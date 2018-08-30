import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double userInput = Double.parseDouble(scanner.nextLine());

        boolean even;

        if (userInput % 2 == 0) {

            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }

}
