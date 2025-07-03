
import java.util.Scanner;


public class PrintName {
    public static void PrintMyName(String name){
        System.out.println(name);
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
/* what happens in memory
stack form 
 */