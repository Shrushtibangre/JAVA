
import java.util.*;

public class indexPrint {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        // System.out.println(Arrays.toString(marks));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("i found at index :" + i);
            }

        }
    }
}
