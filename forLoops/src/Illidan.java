import java.util.Scanner;

public class Illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  toralNumPeople = Double.parseDouble(scanner.nextLine());
        double  powerPerPerson = Double.parseDouble(scanner.nextLine());
        double  blood = Double.parseDouble(scanner.nextLine());

        double totalPower = toralNumPeople * powerPerPerson;
        double diff = Math.abs(totalPower - blood);


        if (totalPower > blood ) {

            System.out.printf("Illidan has been slain! You defeated him with %.0f points.", diff);

        }else {

            System.out.printf("You are not prepared! You need %.0f more points.", diff);

        }


    }


}
