import java.util.Scanner;

public class ifStatment {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            double grate = Double.parseDouble(scanner.nextLine());

            if (grate >= 5.50) {

                System.out.println("Excellent");
            } else if (grate < 5.50){

                System.out.println("Not excelllent");
            }



    }

}
