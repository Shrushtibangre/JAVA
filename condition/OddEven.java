
import java.util.Scanner;

 
public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("It is an even");
        }
        else{
            System.out.println("It is an Odd");
        }
    }
}