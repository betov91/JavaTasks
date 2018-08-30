import java.util.Scanner;

public class drawPictures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double moneyInSafe = Double.parseDouble(scanner.next());
        double months = Double.parseDouble(scanner.next());

        double totalAmountOfSavings = 0;
        double interest = 0;
        double sum = 0;
        double diffInterest = 0;
        double complexInt = moneyInSafe;




       //// simple interest
      for (int i = 1; i <= months; i++) {

          interest = moneyInSafe * 0.03;
          sum += interest;
          totalAmountOfSavings = sum + moneyInSafe;

          double lastMonth = complexInt;
          complexInt = lastMonth + 0.027 * lastMonth;








      }

       System.out.printf("Simple interest rate: %.2f lv.%n", totalAmountOfSavings);
        System.out.printf("Complex interest rate: %.2f lv.%n", complexInt);

        if (totalAmountOfSavings > complexInt){

            double diff = totalAmountOfSavings - complexInt;

            System.out.printf("Choose a simple interest rate. You will win %.2f lv.",diff);

        } else {

            double diff = complexInt - totalAmountOfSavings;


            System.out.printf("Choose a complex interest rate. You will win %.2f lv.",diff);

        }




    }

}
