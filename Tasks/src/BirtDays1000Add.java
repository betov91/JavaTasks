import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class BirtDays1000Add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(sc.next(), formatter).plusDays(999L);

        System.out.println(formatter.format(localDate));

    }
}

