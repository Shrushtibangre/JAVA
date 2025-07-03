
public class Number {

    public static void main(String[] args) {
        int row = 5;
        int count = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(" \n");
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(" \n");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println(" \n");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                int sum =i+j;
                if(sum%2==0)
                {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
               
            }
            System.out.println();
        }

    }

}
