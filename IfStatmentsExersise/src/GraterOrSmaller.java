import java.util.Scanner;

public class GraterOrSmaller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());


        if (firstInput >= secondInput) {

            System.out.println(firstInput);
        } else {

            System.out.println(secondInput);


        }

    }
}
