import javax.swing.event.InternalFrameEvent;
import java.util.Scanner;

public class paralelepipet {
    private static String repeat(String string, int count) {
        String output = "";

        for (int i = 0; i < count; i++) {
            output += string;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // ~
        String tildes = repeat("~", n - 2);

        // first line
        System.out.println(
                "+" + repeat("~", n - 2) + "+" + repeat(".", n * 2 + 1)

        );

        // upper body
        int alterDots = n * 2;
        for (int i = 0; i < n * 2 + 1; i++) {

            System.out.println(

                    "|" + repeat(".", i) + "\\" + tildes + "\\" + repeat(".", alterDots--)

            );

        }


        // lower body
        alterDots = 0;
        for (int i = n * 2; i >= 0; i--) {

            System.out.println(

                    repeat(".", alterDots++) + "\\" + repeat(".", i) + "|" + tildes + "|"

            );

        }


        // last line
        System.out.println(
                repeat(".", n * 2 + 1) + "+" + repeat("~", n - 2) + "+"

        );

        //gorna chast
        //1 . purvi red
        // for cikul, broi redove n * 2 + 1
        // vutreshni for cicul indeks

        // posleden red


        // dolna chast
        // ~ (n - 2)

    }
}
