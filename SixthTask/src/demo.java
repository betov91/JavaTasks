import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the square of stars you wish to see: ");
        int width = Integer.parseInt(scanner.nextLine());




        for (int i = 0; i < width ; i++) {
            System.out.print("*");
            }
        System.out.println("");
        for (int i = 0; i < width - 2 ; i++) {
            System.out.println("*");

            for (int j = 0; j < width - 2 ; j++) {
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();


        }
        for (int i = 0; i <width ; i++) {
            System.out.print("*");

        }



            
        }

    }

