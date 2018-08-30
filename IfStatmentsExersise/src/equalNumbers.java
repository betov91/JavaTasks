import java.util.Scanner;

public class equalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNumber1 = Integer.parseInt(sc.nextLine());
        int inputNumber2 = Integer.parseInt(sc.nextLine());
        int inputNumber3 = Integer.parseInt(sc.nextLine());


        if (inputNumber1 == inputNumber2 && inputNumber2 == inputNumber3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
