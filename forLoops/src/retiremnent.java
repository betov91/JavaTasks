import java.util.Scanner;

public class retiremnent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String gender = scanner.nextLine();
        double yearsOfUser = Double.parseDouble(scanner.nextLine());
        double workExpirience = Double.parseDouble(scanner.nextLine());
        double diff = 0;
        double diffAgain = 0;


// gender
        if (gender.equalsIgnoreCase("male")) {

            // ready to retire
            if (yearsOfUser >= 64 && workExpirience >= 38) {

                System.out.printf("Ready to retire at %.0f and %.0f years of experience!", yearsOfUser, workExpirience);

// not enough old
            } else if (yearsOfUser < 64 && workExpirience >= 38) {

                diff = 64 - yearsOfUser;

                System.out.printf("Worked enough, but not old enough. Years left to retirement: %.0f.", diff);

                // not enough expierience
            } else if (yearsOfUser >= 64 && workExpirience < 38) {

                diff = 38 - workExpirience;

                System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %.0f.", diff);
// not enough expiriece and not enough old
            } else if (yearsOfUser < 64 && workExpirience < 38) {

                diff = 64 - yearsOfUser;
                diffAgain = 38 - workExpirience;


                System.out.printf("Too early. Years left to retirement: %.0f. Work experience left to retirement: %.0f.",diff,diffAgain );
            }


        } else if (gender.equalsIgnoreCase("female")) {

            if (yearsOfUser >= 61 && workExpirience >= 35) {

                System.out.printf("Ready to retire at %.0f and %.0f years of experience!", yearsOfUser, workExpirience);

            } else if (yearsOfUser < 61 && workExpirience >= 35) {

                diff = 61 - yearsOfUser;

                System.out.printf("Worked enough, but not old enough. Years left to retirement: %.0f.", diff);

                // not enough expierience
            } else if (yearsOfUser >= 61 && workExpirience < 35) {

                diff = 35 - workExpirience;

                System.out.printf("Old enough, but haven't worked enough. Work experience left to retirement: %.0f.", diff);

            }else if (yearsOfUser < 61 && workExpirience < 35) {

                diff = 61 - yearsOfUser;
                diffAgain = 35 - workExpirience;


                System.out.printf("Too early. Years left to retirement: %.0f. Work experience left to retirement: %.0f.",diff,diffAgain );
            }

        } else {

            System.out.println("Invalid input.");
        }


    }

}
