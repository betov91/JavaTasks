
import java.util.Scanner;

public class dograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double sum = 0;

        if(delivery.equalsIgnoreCase("With delivery")){
            if(type.equalsIgnoreCase("90X130")) {
                sum = number * 110 ;
                if (number > 10 && number <= 30){

                    sum = sum + 60;

                    System.out.printf("%.2f BGN",sum);

                }else if (number > 30 && number <= 60) {

                    sum = (sum + 60) * 0.95;

                    System.out.printf("%.2f BGN",sum);
                }else if(number > 60 && number <=99){
                    sum = (sum + 60) * 0.92;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =((sum - (sum * 0.08)) + 60) * 0.96;

                    //+ (sum - (sum * 0.08) + 60) *0.04;
                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("100X150")) {
                sum += number * 140 ;
                if (number >10 && number <= 30){
                    sum = sum + 60;

                    System.out.printf("%.2f BGN",sum);


                }else if (number > 40 && number <= 80) {
                    sum = (sum + 60) * 0.94;
                    //sum = sum - (sum * 0.06) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 80 && number <= 99){
                    sum = (sum + 60) * 0.90;
                    // sum = sum - (sum * 0.10) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    //popravil
                    sum =((sum - (sum * 0.10)) + 60) * 0.96;



                    //+ ((sum - (sum * 0.1) + 60) *0.04);




                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("130X180")) {
                sum += number * 190 ;
                if (number >10 && number <= 30){
                    sum = sum + 60;

                    System.out.printf("%.2f BGN",sum);


                }else if (number > 20 && number <= 50) {
                    sum = (sum + 60) * 0.93;
                    // sum = sum - (sum * 0.07) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 50 && number <= 99){
                    sum = (sum + 60) * 0.88;
                    // sum = sum - (sum * 0.12) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =(sum - (sum * 0.12) + 60) * 0.96;


                    //+ ((sum - (sum * 0.12) + 60) *0.04);
                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("200X300")) {
                sum += number * 250 ;
                if (number >10 && number <= 30){
                    sum = sum + 60;

                    System.out.printf("%.2f BGN",sum);


                }else if (number > 25 && number <= 50) {
                    sum = (sum + 60) * 0.91;
                    //sum = sum - (sum * 0.09) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 50 && number <= 99){

                    sum = (sum + 60) * 0.86;
                    // sum = sum - (sum * 0.14) + 60;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =(sum - (sum * 0.14) + 60) * 0.96;


                    //+ ((sum - (sum * 0.12) + 60) *0.04);
                    System.out.printf("%.2f BGN",sum);
                }
            }
        }else if(delivery.equalsIgnoreCase("Without delivery")){
            if(type.equalsIgnoreCase("90X130")) {
                sum += number * 110 ;
                if (number >10 && number <= 30){

                    System.out.printf("%.2f BGN",sum);


                }else if (number > 30 && number <= 60) {
                    sum = sum - (sum * 0.05) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 60 && number <=99){
                    sum = sum - (sum * 0.08) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =(sum - (sum * 0.08) ) * 0.96;

                    //+ (sum - (sum * 0.08) ) *0.04;
                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("100X150")) {
                sum += number * 140 ;
                if (number >10 && number <= 30){

                    System.out.printf("%.2f BGN",sum);


                }else if (number > 40 && number <= 80) {
                    sum = sum - (sum * 0.06) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 80 && number <= 99){
                    sum = sum - (sum * 0.10) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){

                    sum =(sum - (sum * 0.10) ) * 0.96;

                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("130X180")) {
                sum += number * 190 ;
                if (number >10 && number <= 30){

                    System.out.printf("%.2f BGN",sum);

                }else if (number > 20 && number <= 50) {
                    sum = sum - (sum * 0.07) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 50 && number <= 99){
                    sum = sum - (sum * 0.12) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =(sum - (sum * 0.12)) * 0.96;

                    //+ ((sum - (sum * 0.12)) *0.04);
                    System.out.printf("%.2f BGN",sum);
                }
            }
            if(type.equalsIgnoreCase("200X300")) {
                sum += number * 250 ;
                if (number >10 && number <= 30){

                    System.out.printf("%.2f BGN",sum);
                }else if (number > 25 && number <= 50) {
                    sum = sum - (sum * 0.09) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number > 50 && number <= 99){
                    sum = sum - (sum * 0.14) ;
                    System.out.printf("%.2f BGN",sum);
                }else if(number <= 10){
                    System.out.println("Invalid order");
                }else if(number > 99){
                    sum =(sum - (sum * 0.14)) * 0.96;

                    System.out.printf("%.2f BGN",sum);
                }
            }
        }
    }
}
