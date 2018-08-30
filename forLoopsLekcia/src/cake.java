import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());
        int lenght = Integer.parseInt(input.nextLine());
        int cakeArea = width * lenght;
        for (int i = 0; i > -1; i++) {
            String n = input.nextLine();
            if (n.equalsIgnoreCase("Stop")) {
                System.out.printf("%d pieces are left.", cakeArea);
                break;
            }
            int m = Integer.parseInt(n);
            cakeArea -= m;
            if (cakeArea < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
                break;
            }
        }


    }
}