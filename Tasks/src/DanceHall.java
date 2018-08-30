import java.util.Scanner;

public class DanceHall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        double length = Double.parseDouble(scanner.nextLine());
        double breadth = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());



        double wardrobe = (100 * a) * (100 * a);
        double perimeter = (100 * breadth) * (100 * length);
        double bench = perimeter / 10;
        double freSpace = perimeter - wardrobe - bench;
        double numOfDancers = freSpace / (40 + 7000);





       // System.out.print(Math.floor(numOfDancers));

       System.out.printf("%.0f", Math.floor(numOfDancers));


        //probvah s round, no round zakruglq do po blizkoto cqlo chislo, a ne do po malkoto. S round mi dava 40% veren rezultat.
        // probvah da castna dobuble kum int, no mi otpechatva veren samo purviq otgovor vsichko drugo greshno.


        }

}
