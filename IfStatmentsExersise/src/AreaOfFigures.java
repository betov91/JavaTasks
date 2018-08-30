import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputFigures = sc.nextLine();


        if (inputFigures.equals("square")){

            Double side = Double.parseDouble(sc.nextLine());
             double area = side * side;
            System.out.printf("%.3f", area);

        }else if (inputFigures.equals("rectangle")){

            Double side = Double.parseDouble(sc.nextLine());
            Double sideB = Double.parseDouble(sc.nextLine());
            double area = side * sideB;
            System.out.printf("%.3f", area);
        }else if (inputFigures.equals("circle")){

            Double radius  = Double.parseDouble(sc.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);
        }else if (inputFigures.equals("triangle")){

            Double b = Double.parseDouble(sc.nextLine());
            Double height = Double.parseDouble(sc.nextLine());
            double area = (b * height) / 2;
            System.out.printf("%.3f", area);
        }
    }

}
