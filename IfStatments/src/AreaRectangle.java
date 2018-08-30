import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int lenght = 0;
        int breadth = 0;
        int area = 0;
        int perimeter = 0;

        System.out.print("Enter lenght: ");
        lenght = scanner.nextInt();

        System.out.print("Enter breath: ");
        breadth = scanner.nextInt();

        area = lenght * breadth;
        perimeter = 2 * (lenght + breadth);

        System.out.println("Area is: " + area);
        System.out.print("Perimeter is: " + perimeter);
    }
}
