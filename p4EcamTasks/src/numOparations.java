import java.util.Scanner;

public class numOparations {
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

                System.out.print(" - even");
            }else {
                System.out.print(" - odd");

            }


        }else    if (operator.equals("-")){



            System.out.printf("%.0f - %.0f = %.0f",firstNum, secondNum, minus);
            if (minus % 2== 0){

                System.out.print(" - even");
            }else {
                System.out.print(" - odd");

            }


        }else    if (operator.equals("*")){



            System.out.printf("%.0f * %.0f = %.0f",firstNum, secondNum, multiply);
            if (multiply % 2== 0){

                System.out.println(" - even");
            }else {
                System.out.print(" - odd");

            }


        }else if (operator.equals("/")){

            if (firstNum == 0 ){

                System.out.printf("Cannot divide %.0f by zero", secondNum);


            }else if (secondNum == 0){

                System.out.printf("Cannot divide %.0f by zero", firstNum);

            }else

                System.out.printf("%.0f / %.0f = %.2f",firstNum, secondNum, devide);

        }else if (operator.equals("%")){

            if (firstNum == 0 ){

                System.out.printf("Cannot divide %.0f by zero", secondNum);


            }else if (secondNum == 0){

                System.out.printf("Cannot divide %.0f by zero", firstNum);

            }else  {

                System.out.printf("%.0f",firstNum);
                System.out.print(" % ");
                System.out.printf("%.0f = %.0f", secondNum, modul);}

        }


    }
}
