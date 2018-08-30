import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        short one = 2;
        short two = 5;
        short three = 8;
        short ten =10;

        System.out.print("Enter number: ");

        one = scanner.nextShort();
        two = scanner.nextShort();
        three = scanner.nextShort();
        ten = scanner.nextShort();

        if (one == 2){
            System.out.print(one * 10);
        } if ( two == 5){
            System.out.print(two * 100);

        }if (three == 8){

            System.out.print(three * 1000);
        } if (ten >= 10 && sout ){
            System.out.println("invalid score");
        }
    }
}
