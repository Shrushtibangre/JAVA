
import java.util.Scanner;

public class greater {

    public static int PrintGreater(int num1, int num2) {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        
        System.out.println(PrintGreater(num1, num2));
    }
}
