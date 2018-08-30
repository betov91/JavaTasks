import java.util.Scanner;

    public class tryone {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int widthFreeSpace = Integer.parseInt(sc.nextLine());
            int lengthFreeSpace = Integer.parseInt(sc.nextLine());
            int heightFreeSpace = Integer.parseInt(sc.nextLine());


            boolean isString = false;
            boolean isNumber = true;
            String word = "";

            int result = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
            int sum = 0;


            while (!word.equals("Done")) {
                try {
                    if (isNumber) {
                        int otherBoxes = Integer.parseInt(sc.nextLine());
                        sum += otherBoxes;
                    } else {
                        String word1 = sc.nextLine();
                        word += word1;
                    }


                    if (result < sum) {
                        break;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            if (result < sum) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(result - sum));
            } else if (result > sum) {
                System.out.printf("%d Cubic meters left.", Math.abs(result - sum));
            }
        }
    }
