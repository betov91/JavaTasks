import java.util.Scanner;

public class ads{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int cakeArea = width * lenght;

        for (int i = 0; i < -1 ; i++) {

            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("STOP")){

                System.out.println( cakeArea + "pieces are left.");
                break;


            }


            int m = Integer.parseInt(word);
            cakeArea -= m;

            if (cakeArea < 0){

                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeArea));
                break;

            }
        }


    }

}
