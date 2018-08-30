import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(i == 1 || i == num){
                    System.out.print("*");
                }else if(j == num-(num-1) || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
