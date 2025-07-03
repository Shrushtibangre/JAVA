public class strings{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("MOnuy");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0+1));

        // set char at index 0  //UPDATED
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // INSERT IN STRING
        sb.insert(0, 'O');
        sb.insert(2, 'n');
        System.out.println(sb);


        // delete
        sb.delete(2, 3);
        System.out.println("");
    }
}
