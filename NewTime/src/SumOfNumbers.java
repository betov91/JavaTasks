import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a number: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("This is the result: ");
        int result = a + b;

        System.out.println(result);

    }

}
