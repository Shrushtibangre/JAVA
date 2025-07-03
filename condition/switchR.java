
import java.util.Scanner;

public class switchR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            case 4 -> System.out.println("MauMau");
            default -> System.out.println("Invalid button");
        }

    }
}
