
import java.util.Scanner;
public class NewProject {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double moneyToString = Double.parseDouble(scanner.nextLine());
        String firstcurrency = scanner.nextLine();
        String secondcurrency = scanner.nextLine();

         double firstRate = 0.0;
         double secondRate = 0.0;

            double leva = 1;
            double dolari = 1.79549;
            double evro = 1.95583;
            double punds = 2.53405;






        if ((firstcurrency).equals("BGN"))
        {
            firstRate = 1;
        }
        else if ((firstcurrency).equals("USD"))
        {
            firstRate = 1.79549;
        }
        else if ((firstcurrency).equals("EUR"))
        {
            firstRate = 1.95583;
        }
        else if ((firstcurrency).equals("GBP"))
        {
            firstRate = 2.53405;
        }
        if ((secondcurrency).equals("BGN"))
        {
            secondRate = 1;
        }
        else if ((secondcurrency).equals("USD"))
        {
            secondRate = 1.79549;
        }
        else if ((secondcurrency).equals ("EUR"))
        {
            secondRate = 1.95583;
        }
        else if ((secondcurrency).equals ("GBP"))
        {
            secondRate = 2.53405;
        }

        double result = moneyToString * (firstRate / secondRate);


        System.out.println(result);


            }
        }

