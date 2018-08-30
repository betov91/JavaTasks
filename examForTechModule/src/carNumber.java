import java.util.Scanner;

    public class carNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());

            int biggerNum = Math.max(n1,n2);
            int smallerNum = Math.min(n1,n2);


            for (int num1 = n1; num1 <=n2; num1++) {
                for (int num2 = n1; num2 <=n2; num2++) {
                    for (int num3 = n1; num3 <=n2; num3++) {
                        for (int num4 = n1; num4 <=n2; num4++) {
                            if (num1>num4&&(num2+num3)%2==0){
                                if (num1%2!=0&&num4%2==0){
                                    System.out.printf("%d%d%d%d ", num1,num2,num3,num4);

                                }
                                else if(num1%2==0&&num4%2!=0){
                                    System.out.printf("%d%d%d%d ", num1,num2,num3,num4);

                                }
                            }
                        }
                    }
                }
            }

        }

    }

