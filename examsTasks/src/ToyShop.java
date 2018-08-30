import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double priceOfHoliday = Double.parseDouble(sc.nextLine());
        int numPusels = Integer.parseInt(sc.nextLine());
        int numDolls =  Integer.parseInt(sc.nextLine());
        int numBears =  Integer.parseInt(sc.nextLine());
        int numMinions = Integer.parseInt(sc.nextLine());
        int numTrucks = Integer.parseInt(sc.nextLine());

        double priceOfPusels = 2.60;
        double priceOfDolls = 3;
        double priceOfBears = 4.10;
        double priceOfMinions = 8.20;
        double priceOfTrucks = 2;

        String text = "Yes!";
        String text1 = "lv left.";
        String text2 = "Not enough money!";
        String text3 = "lv needed.";

        double priceOfAllSoldToys = (numPusels * priceOfPusels) + (numDolls * priceOfDolls) + (numBears * priceOfBears) +
                (numMinions * priceOfMinions) + (numTrucks * priceOfTrucks);


        double numberOfSoldToys = numPusels + numDolls + numBears + numMinions + numTrucks;

        double priceToysDiscount = numberOfSoldToys * 0.25;

        double income = (priceOfAllSoldToys * 0.75) * 0.90;
        double income1 = priceOfAllSoldToys * 0.90;

        double leftMoney = income - priceOfHoliday;
        double leftMoneyNoDiscount = Math.abs(income1 - priceOfHoliday);




           if (numberOfSoldToys >= 50 && income > priceOfHoliday) {

               System.out.printf("%s %.2f %s",text,leftMoney,text1 );


            } else if (numberOfSoldToys < 50){

               System.out.printf("%s %.2f %s",text2,leftMoneyNoDiscount,text3 );

            }



       }


}


