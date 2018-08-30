import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOfStudetns = Double.parseDouble(scanner.nextLine());


        double sumGrades = 0;

        double  percent1 = 0;
        double  percent2 = 0;
        double  percent3 = 0;
        double  percent4 = 0;

        double percentFinal1 = 0;
        double percentFinal2 = 0;
        double percentFinal3 = 0;
        double percentFinal4= 0;

        for (int i = 0; i <numOfStudetns ; i++) {

            double grades = Double.parseDouble(scanner.nextLine());


            if (grades >= 2.0 && grades <= 2.99){

                sumGrades += grades;
                grades = 1;
                percent1 += grades;

                percentFinal1 =( percent1 * 100) /numOfStudetns;



            }else if (grades >= 3.0 && grades <= 3.99){

                sumGrades += grades;
                grades = 1;
                percent2 += grades;
                percentFinal2 =( percent2 * 100) /numOfStudetns;


            }else if (grades >= 4.0 && grades <= 4.99){

                sumGrades += grades;
                grades = 1;
                percent3 += grades;
                percentFinal3 =( percent3 * 100) /numOfStudetns;


            }else if (grades >= 5.0 && grades <= 6.0){

                sumGrades += grades;
                grades = 1;
                percent4 += grades;
                percentFinal4 =( percent4 * 100) /numOfStudetns;


            }




        }

         double average = sumGrades / numOfStudetns;


        System.out.printf("Top students: %.2f%%\n", percentFinal4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentFinal3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentFinal2);
        System.out.printf("Fail: %.2f%%\n", percentFinal1);
        System.out.printf("Average: %.2f\n", average);



    }
}
