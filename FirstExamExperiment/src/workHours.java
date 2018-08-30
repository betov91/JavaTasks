import java.util.Scanner;

public class workHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int workersNum = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int oneWorkerDay = 8;
        int totalHours = (workersNum * oneWorkerDay) * workDays;

        if (totalHours > neededHours){

            double diff = totalHours - neededHours;

            System.out.printf("%.0f hours left\n", diff);

        }else{

            double diff = neededHours - totalHours;
            System.out.printf("%.0f overtime\n", diff);
            double penalties = diff * workDays;

            System.out.printf("Penalties: %.0f\n", penalties);

        }



    }


}
