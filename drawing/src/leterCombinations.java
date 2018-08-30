import java.util.Scanner;

public class leterCombinations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         char firstLetter = scanner.nextLine().charAt(0);
        char secondLEtter = scanner.nextLine().charAt(0);
        char thirdLetter = scanner.nextLine().charAt(0);

        String output = "";
        int count = 0;

        for (char i = firstLetter; i <= secondLEtter ; i++) {

            for (char j = firstLetter; j <= secondLEtter ; j++) {

                for (char k = firstLetter; k <= secondLEtter ; k++) {

                    String generatedString = i + "" + j + k;
                    System.out.println(generatedString);

                    if (!generatedString.contains(String.valueOf(thirdLetter))){

                        output += generatedString + " ";
                        count++;


                    }

                }

            }

        }

        System.out.print(output)   ;
        System.out.println(count);

    }


}
