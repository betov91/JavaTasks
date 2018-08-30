import java.util.Scanner;

public class examTaskPictureStudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numPictures = Double.parseDouble(scanner.nextLine());
        String typeOfPictures = scanner.nextLine();
        String typeOfOrder = scanner.nextLine();


        double priceOfPicture = -0;
        double discount = 0;
        double totalDisount = 0;


        // pirce of pictures

            if (typeOfPictures.equals("9X13")) {

                    if (numPictures >= 50) {

                        priceOfPicture = (numPictures * 0.16) * 0.95;
                    } else {
                        priceOfPicture = numPictures * 0.16;

                    }
                } else if (typeOfPictures.equals("10X15")) {

                    if (numPictures >= 80) {
                        priceOfPicture = (numPictures * 0.16) * 0.97;
                    } else {
                        priceOfPicture = numPictures * 0.16;

                    }

                } else if (typeOfPictures.equals("13X18")) {


                    if ((numPictures >= 50 && numPictures <= 100)) {

                        priceOfPicture = (numPictures * 0.38) * 0.97;

                    } else if (numPictures > 100) {

                        priceOfPicture = (numPictures * 0.38) * 0.95;

                    } else {
                        priceOfPicture = numPictures * 0.38;

                    }
                } else if (typeOfPictures.equals("20X30")) {


                    if ((numPictures >= 10 && numPictures <= 50)) {

                        priceOfPicture = (numPictures * 2.90) * 0.93;

                    } else if (numPictures > 50) {

                        priceOfPicture = (numPictures * 2.90) * 0.91;

                    } else {

                        priceOfPicture = numPictures * 2.90;

                    }
                }



        if (typeOfOrder.equals("online")) {

            totalDisount = priceOfPicture * 0.98;
            } else {

            totalDisount = priceOfPicture;
        }
        System.out.printf("%.2fBGN", totalDisount);

        }





    }

