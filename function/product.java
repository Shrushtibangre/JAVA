
import java.util.Scanner;

public class product{

    public static int PrintProduct(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int multi = PrintProduct(num1, num2);
        System.out.println(multi);
    }
}