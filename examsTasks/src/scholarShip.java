import java.util.Scanner;

public class scholarShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double income = Double.parseDouble(sc.nextLine());
        double avaregeGrade = Double.parseDouble(sc.nextLine());
        double minimumWage = Double.parseDouble(sc.nextLine());

        double socialScolarShip = minimumWage * 0.35;
        double excellentScolarShip = avaregeGrade * 25;


        if (income > minimumWage && avaregeGrade > 4.50 && avaregeGrade < 5.50 || income < minimumWage && avaregeGrade < 4.50 || income < minimumWage && avaregeGrade < 4.50) {


            System.out.println("You cannot get a scholarship!");

        } else if (income < minimumWage && avaregeGrade > 4.50 && avaregeGrade < 5.50) {


            System.out.print("You get a Social scholarship ");
            System.out.printf("%.0f", socialScolarShip);
            System.out.print(" BGN");

        } else if (avaregeGrade >= 5.50 && income > minimumWage) {

            System.out.print("You get a scholarship for excellent results ");
            System.out.print( (int) excellentScolarShip);
            System.out.print(" BGN");


            }else if ( socialScolarShip > excellentScolarShip  ){

                System.out.print("You get a Social scholarship ");
                System.out.printf("%.0f", socialScolarShip );
                System.out.print(" BGN");
            } else if( excellentScolarShip >= socialScolarShip){

                System.out.print("You get a scholarship for excellent results ");
                System.out.printf("%.0f", excellentScolarShip );
                System.out.print(" BGN");

            }

    }
}