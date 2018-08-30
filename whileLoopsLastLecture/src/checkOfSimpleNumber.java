import java.util.Scanner;

public class checkOfSimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       boolean isPrime = true;

        for (int i = 2; i <n ; i++) {

            if ( n % i == 0){
                System.out.println("Not prime");
                isPrime = false;
                break;

            }

         }
        if (isPrime){
            System.out.println("Prime");

        }
    }
}
