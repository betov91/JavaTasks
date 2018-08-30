import java.util.Scanner;

public class RoundTry {

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);


            double worldRecord = Double.parseDouble(sc.nextLine());
            double disInMetres = Double.parseDouble(sc.nextLine());
            double timeSwimOneMeterInSec = Double.parseDouble(sc.nextLine());




            double timeOfSwim =disInMetres * timeSwimOneMeterInSec ;
            double resistanceOnly = Math.floor(disInMetres / 15) * 12.5;


            System.out.println( resistanceOnly);
        }
    }

