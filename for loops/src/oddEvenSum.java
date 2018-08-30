import java.util.Scanner;

public class oddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int oddsSum = 0;
        int evensSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i%2 == 1) { //i=1 is the first and at an odd position
                oddsSum += Integer.parseInt(sc.nextLine());
            } else {
                evensSum += Integer.parseInt(sc.nextLine());
            }
        }

        if (Math.abs(evensSum - oddsSum) == 0) {
            System.out.println("Yes");
            System.out.println("Sum = " + evensSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evensSum - oddsSum));
        }

    }
}


