import java.util.Scanner;

public class leftRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int leftSum = 0;
        int rightSum = 0;


        for (int i = 1; i <= n ; i++) {

            int nummber = scanner.nextInt();

            leftSum = leftSum + nummber;
           }

        for (int i = 0; i < n; i++) {
            int nummber = scanner.nextInt();

            rightSum = rightSum + nummber;

        }

            if (leftSum == rightSum){
                System.out.println("Yes, sum = " + rightSum);


            }else{

            int  diff = Math.abs(rightSum - leftSum);


                System.out.println("No, diff = " + diff);
            }




    }

}
