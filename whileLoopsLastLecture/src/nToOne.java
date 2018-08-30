import java.util.Scanner;

public class nToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int i = n; i >= 1; i-=1) {

            System.out.println(n);

            num *= 2;

        }

        System.out.println(num);
    }

}
