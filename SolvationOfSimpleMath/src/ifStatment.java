import java.util.Scanner;

public class ifStatment {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int firstNum = 3;
        int secondNum = 6;

        System.out.print("Enter a number: ");

        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();

        if (firstNum <= 3){

            System.out.print(firstNum * 10);
        } else {
            System.out.println(secondNum * 100);

        }



        }}








