import java.util.Scanner;

public class TrueFalse {

    public static void main(String[] args){

        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (i%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }

    }

}
