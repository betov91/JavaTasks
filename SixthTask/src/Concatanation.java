import java.util.Scanner;
public class Concatanation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String last = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",name, last, years, town);

        }
}