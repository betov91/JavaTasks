import java.util.Scanner;

public class fruitOrVegatable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();


        if (product.equals("banana")) {
            System.out.println("fruit");
        } else if (product.equals("apple")) {
            System.out.println("fruit");
        } else if (product.equals("kiwi")) {
            System.out.println("fruit");
        } else if (product.equals("cherry")) {
            System.out.println("fruit");
        } else if (product.equals("lemon")) {
            System.out.println("fruit");
        } else if (product.equals("grapes")) {
            System.out.println("fruit");
        }else if (product.equals("tomato")) {
            System.out.println("vegetable");
        } else if (product.equals("cucumber")) {
            System.out.println("vegetable");
        } else if (product.equals("pepper")) {
            System.out.println("vegetable");
        } else if (product.equals("carrot")) {
            System.out.println("vegetable");
        }else {

            System.out.println("unknown");
        }

    }
}
