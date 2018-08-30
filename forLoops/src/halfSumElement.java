import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int number = Integer.parseInt(scanner.nextLine());

       int maxNum = Integer.MIN_VALUE;
        int sum = 0;

       for (int i = 0; i < number; i++) {

           int largestOne = Integer.parseInt(scanner.nextLine());

           sum += largestOne;

           if (largestOne > maxNum) {

               maxNum = largestOne;
           }
       }



           if (maxNum == 1){

               System.out.print("No\nDiff = " + 1);

           }else if ((sum - maxNum) == maxNum){

               System.out.print("Yes\nSum = " + maxNum);

               }else  {

               System.out.println("No\nDiff = " + Math.abs(sum - maxNum - maxNum));
           }



           }



    }
