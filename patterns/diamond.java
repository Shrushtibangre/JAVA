public class diamond{
    public static void main(String[] args) {
        int row=5;
        int col=5;
        for (int i = 1; i < row; i++){
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            // j<=2*i-1
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+ " ");
            }

            System.out.println();

        }
        for (int i = row; i >= 1; i--){
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+ " ");
            }

            System.out.println();

        }



         for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++) {

                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
         for (int i = row; i >=1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++) {

                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}