import java.util.Scanner;

public class pointOnRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double y1 = Double.parseDouble(scanner.nextLine());
        double x1 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());


        boolean onUpLine = x == x1 && y >= y1 && y <= y2;
        boolean onBottomLine = x == x2 && y >= y1 && y <= y2;
        boolean onRightLine = y == y1 && x >= x1 && x <= x2;
        boolean onLeftLine = y == y2 && x >= x1 && x <= x2;


        if (onUpLine || onBottomLine || onRightLine || onLeftLine) {
            System.out.println("Border");
        } else {

            System.out.println("Inside / Outside");
        }


    }

}