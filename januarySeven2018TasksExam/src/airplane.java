import java.util.Scanner;

public class airplane {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int hour = Integer.parseInt(scanner.nextLine());
    double min = Double.parseDouble(scanner.nextLine());
    double timeFlight = Double.parseDouble(scanner.nextLine());


    double hourInMin = hour * 60;
    double total = min + timeFlight;
    double hourPrint = (total + hourInMin) / 60;
    double minPrint = (total + hourInMin) % 60;
    //  double exactHours = hourPrint - ( min / 60) ;

   // char hours = 'h';
  //  char minutes = 'm';

  //  double ifMore = 0;
  //  double  diff = 0;


    if (hourPrint >=24){
        hourPrint -= 24;
    }System.out.printf("%.0fh %.0fm",hourPrint, minPrint);

      //  diff = (hourPrint - 23);
      //  if (hourPrint == 24){
      //      diff = 0;
      //  }else if (hourPrint > 24){
      //      diff = Math.abs(ifMore - 1);
//
        }
       // System.out.printf("%.0f%s %.0f%s",diff,hours, minPrint, minutes);

}


