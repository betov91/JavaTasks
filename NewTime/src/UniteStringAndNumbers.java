import java.util.Scanner;

public class UniteStringAndNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("First name: ");

        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Age: ");


        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Home town: ");

        String town = scanner.nextLine();
        System.out.printf("You are %s, %s, a %d-years old from %s.", firstName, lastName, age, town);



    }

}
