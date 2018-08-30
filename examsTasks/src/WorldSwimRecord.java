import java.util.Scanner;

public class WorldSwimRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double worldRecord = Double.parseDouble(sc.nextLine());
        double disInMetres = Double.parseDouble(sc.nextLine());
        double timeSwimOneMeterInSec = Double.parseDouble(sc.nextLine());


        double timeOfSwim = disInMetres * timeSwimOneMeterInSec;
        double resistanceOnly = Math.floor(disInMetres / 15) * 12.5;

        double swimAndResistance = timeOfSwim + resistanceOnly;
        double difference = Math.abs(worldRecord - swimAndResistance);
        String text = "Yes, he succeeded! The new world record is";
        String text1 = "seconds.";
        String text2 = "No, he failed! He was";
        String text3 = "seconds slower.";





        if (worldRecord > swimAndResistance){

            System.out.printf( "%s %.2f %s",text,swimAndResistance,text1);


        }else {
            System.out.printf( "%s %.2f %s",text2,difference,text3);
        }





    }

}
