import java.util.Scanner;

public class numberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum  = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();

        double plus = firstNum + secondNum;
        double minus = firstNum - secondNum;
        double  multiply = firstNum * secondNum;
        double  devide = firstNum / secondNum;
        double  modul = firstNum % secondNum;


        if (operator.equals("+")){



            System.out.printf("%.0f + %.0f = %.0f",firstNum, secondNum, plus);
            if (plus % 2== 0){

                System.out.println(" - even");
            }else {
                System.out.print(" - odd");

            }


        }


    }
}