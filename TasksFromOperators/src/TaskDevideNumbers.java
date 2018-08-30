import java.util.Scanner;

public class TaskDevideNumbers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);



        int num1 = 0;
        int num2 = 0;

        System.out.print("Enter a number: ");
         int num = input.nextInt();


        num1 = num / 100;

        if (num1% 7==0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }










    }
}
