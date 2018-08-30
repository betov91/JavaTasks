import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String product = console.nextLine();
        String city = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());


        if (city.equals("Sofia")) {

            if (product.equals("coffee")) {

                System.out.println(quantity * 0.50);
            } else if (product.equals("water")) {
                System.out.print(quantity * 0.80);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.20);
            } else if (product.equals("sweets")) {
                System.out.print(quantity * 1.45);
            } else if (product.equals("peanuts")) {
                System.out.print(quantity * 1.60);
            }
        }
        if (city.equals("Plovdiv")) {

            if (product.equals("coffee")) {

                System.out.println(quantity * 0.40);
            } else if (product.equals("water")) {
                System.out.print(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.print(quantity * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.print(quantity * 1.50);
            }
        }
        if (city.equals("Varna")) {

            if (product.equals("coffee")) {

                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.print(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.10);
            } else if (product.equals("sweets")) {
                System.out.print(quantity * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.print(quantity * 1.55);
            }
        }
    }


}

