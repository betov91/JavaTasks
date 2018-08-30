import java.util.Scanner;

public class BooleanDevides {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         int one = scanner.nextInt();


         if (one % 5 == 0 && one % 7 == 0){

             System.out.println("true");
         } else {
             System.out.println("false");
         }

    }
}
