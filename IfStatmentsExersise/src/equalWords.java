import java.util.Scanner;

public class equalWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String secondword = sc.nextLine();

       // word = word.toLowerCase();
       // secondword = word.toLowerCase();

        if (word.equalsIgnoreCase(secondword)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        }
}
