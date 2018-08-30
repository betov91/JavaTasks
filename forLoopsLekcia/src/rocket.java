import java.util.Scanner;

public class rocket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        int outsideDots;
        int space = 0;
        int dots = 0;

        for (int i = 0; i <= n; i ++) {

            outsideDots = ((n * 3) - 2) - i;

            String out = repeat(".", outsideDots) + "/" + repeat(" ", space) + "\\" + repeat(".", outsideDots);


            dots -= 1;
            space += 2;

            System.out.println(out);
        }



        int starsLine = (n * 2);


        for (int i = 1; i <= 1 ; i++) {


            String out = repeat(".",dots) + repeat("*",starsLine) + repeat(".", dots);


                    dots = n / 2;

            System.out.println(out);


        }
    }

    private static String repeat(String string, int count) {
        String output = "";

        for (int i = 0; i < count; i++) {
            output += string;
        }

        return output;
    }
}

