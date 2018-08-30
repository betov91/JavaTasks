import java.util.Scanner;

public class sixTaskControlNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int controlNum = Integer.parseInt(scanner.nextLine());

        int moves = 0;
        int sum = 0;
        for (int i = 1; i < firstNum; i++) {

            for (int j = secondNum; j >= 1 ; j--) {

                moves++;
                sum += (i*2)+ (j * 3);


                if (sum >= controlNum){

                    System.out.println(String.format("Score: %d >= %d", sum, controlNum));
                    return;
                }

            }


        }

        System.out.println(moves + "moves");


    }
}
