
import java.util.Scanner;

public class aToZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                char ch =(char) ('A'+i+j-2);
                System.out.print(ch);

            }
            System.out.println(" ");
        }
    }
}
