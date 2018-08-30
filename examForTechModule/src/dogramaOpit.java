import java.util.Scanner;

public class dogramaOpit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double sum = 0;

         if (delivery.equalsIgnoreCase("With delivery")) {
             if (type.equalsIgnoreCase("90X130")) {



                 if (number > 30 && number <= 60){




                 }else  if (number > 60){


                 }


             } else if (type.equalsIgnoreCase("100X150")) {


             } else if (type.equalsIgnoreCase("130X180")) {


             } else if (type.equalsIgnoreCase("200X300")) {


             }
         }else if (delivery.equalsIgnoreCase("Without delivery")){

             if (type.equalsIgnoreCase("90X130")) {


             } else if (type.equalsIgnoreCase("100X150")) {


             } else if (type.equalsIgnoreCase("130X180")) {


             } else if (type.equalsIgnoreCase("200X300")) {


             }

         }
    }

}
