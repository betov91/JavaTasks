import java.util.Scanner;

public class energyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int trainDays = Integer.parseInt(scanner.nextLine());
        int dancersNum = Integer.parseInt(scanner.nextLine());

        int spendEnergy1 = 0;
        int spendEnergy2 = 0;
        int spendEnergy3 = 0;
        int spendEnergy4 = 0;
        int sum =  0;
        int totalEnergy = 100 * trainDays * dancersNum;
        int totalEnergyAll = 0;

        int  result =  0;

        int finalResult = 0;


        for (int i = 0; i <= trainDays + 1; i++) {

            int hoursDance = Integer.parseInt(scanner.nextLine());


            if (trainDays % 2 == 0 &&  hoursDance % 2 == 0 ){

           spendEnergy1 = 68 * dancersNum;
           totalEnergyAll += spendEnergy1;


            }else  if (trainDays % 2 != 0 &&  hoursDance % 2 == 0 ){

                spendEnergy2 = 49 * dancersNum;
                totalEnergyAll += spendEnergy2;


            }else  if (trainDays % 2 == 0 &&  hoursDance % 2 != 0 ){

                spendEnergy3 = 65 * dancersNum;
                totalEnergyAll += spendEnergy3;


            }else  if (trainDays % 2 != 0 &&  hoursDance % 2 != 0 ){

                spendEnergy4 = 30 * dancersNum;
                totalEnergyAll += spendEnergy4;


            }



            result =   totalEnergy - totalEnergyAll;
            finalResult = (result / dancersNum) / trainDays;



    }


        if (finalResult <= 50){

            System.out.println("They feel good! Energy left: " + finalResult);

        }else {

            System.out.println("They are wasted! Energy left: " + finalResult);

        }

    }}
