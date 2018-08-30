import java.util.Scanner;

public class asciiCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int symbols = 0;

        int maxNum = Integer.MIN_VALUE;


        String digitStrnig = "";
        String upperCaseString = "";
        String lowerCaseString = "";
        String symbolsString = "";



        for (int i = 1; i < number; i++) {

            char n = scanner.nextLine().charAt(0);

            if (Character.isDigit(n)) {

                digit += n;
                digitStrnig += n;




            } else if (Character.isUpperCase(n)) {

                upperCase += n;
                upperCaseString += n;


            } else if (Character.isLowerCase(n)) {

                lowerCase += n;
                lowerCaseString += n;



            } else {

                symbols += n;
                symbolsString += n;


            }

            if (digit > maxNum){

                maxNum = digit;


            }else if (upperCase > maxNum){

                maxNum = upperCase;
            }else if (lowerCase > maxNum){

                maxNum = lowerCase;

            } else if (symbols > maxNum){

                maxNum = symbols;

            }

        }

        System.out.print("Biggest ASCII sum is: " + maxNum);
    }
}
