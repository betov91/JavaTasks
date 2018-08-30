import javafx.beans.binding.DoubleExpression;

import java.util.Scanner;

public class oddEvenPossition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


        double EvenMax = Double.MIN_VALUE;
        double OddMax = Double.MIN_VALUE;
        double EvenMin = Double.MAX_VALUE;
        double OddMin = Double.MAX_VALUE;


        double OddsSum = 0.0;
        double EvenSum = 0.0;
        double maxEven = 0.0;
        double maxOdd = 0.0;
        double minEven = 0.0;
        double minOdd = 0.0;

// it finds sum of evens and odds

        for (int i = 1; i <= n; i++) {

            double number = Double.parseDouble(sc.nextLine());


            if (i % 2 != 0) {


                OddsSum += number;

                if (number < OddMin) {

                    OddMin = number;
                    minOdd = number;

                }
                if (number > OddMax) {

                    OddMax = number;
                    minOdd = number;


                }


            } else {


                EvenSum += number;
                if (number < minEven) {
                    minEven = number;
                    EvenMin = number;
                }
                if (number > maxEven) {
                    maxEven = number;
                    EvenMax = number;


                }


            }
            System.out.println(OddsSum);
            System.out.println(EvenSum);

        }


    }

}

