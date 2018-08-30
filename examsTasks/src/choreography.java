import java.util.Scanner;

public class choreography {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double numSteps = Double.parseDouble(sc.nextLine());
        double dancers = Double.parseDouble(sc.nextLine());
        double dayOfStudying = Double.parseDouble(sc.nextLine());


         double percentStepOfDay = Math.ceil(100 / dayOfStudying);
        double percentStepDancer = (percentStepOfDay / dancers);


        if (percentStepOfDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! " + "%.2f", percentStepDancer);
            System.out.print("%.");

        } else if (percentStepOfDay > 13) {

            System.out.print("No, They will not succeed in that goal!");
            System.out.printf(" Required " + "%.2f", percentStepDancer);
            System.out.print("% steps to be learned per day.");


        }


    }


}





