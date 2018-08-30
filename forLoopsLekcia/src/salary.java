import java.util.Scanner;

public class salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salaryBase = Double.parseDouble(scanner.nextLine());
        double expirience = Double.parseDouble(scanner.nextLine());
        String sindicateOrNot = scanner.nextLine();
        double salaryWithPercent = salaryBase;


        for (int i = 0; i < expirience; i++) {

         double lastYear = salaryWithPercent;

         salaryWithPercent += 0.6 * salaryBase;

         if(expirience >= 5){

             salaryWithPercent += 100;

         }


            
        }




    }

}
