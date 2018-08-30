import java.util.Scanner;

public class animalTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String typeOfAnimal = scanner.nextLine();


        switch (typeOfAnimal) {
            case "dog": {
                System.out.println("mammal");
            }
            break;
            case "crocodile":{

                System.out.println("reptile");
            }
            break;
            case "tortoise": {

                System.out.println("reptile");
            }
            break;
            case "snake":{
                System.out.println("reptile");
            }
            break;
            default: {
                System.out.println("unknown");
            }

        }

    }
}