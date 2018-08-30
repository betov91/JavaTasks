import java.util.Scanner;

public class SolutinBonusScore {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        if (userInput >= 1 && userInput <=3){
            System.out.println(userInput * 10);
        }
        else if (userInput >=4 && userInput <=6){
            System.out.println(userInput * 100 );
        }

        else if (userInput >=7 && userInput <=9){

            System.out.println(userInput * 1000);
        } else {
            System.out.println("invalid score");}



    }
}
