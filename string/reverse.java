
// public class reverse{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Hello");

//         for (int i = 0; i < sb.length()/2; i++) {
//             int front = i;
//             int back = sb.length()-1-i;//5-1-0

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);
//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }
//         System.out.println(sb);
//     }
// }




public class reverse{
    public static void main(String args[]){
     StringBuilder sb =new StringBuilder("Shrushti");
      
      for (int i = 0; i < sb.length()/2; i++) {
          
          int front =i;
          int back= sb.length()-1-i;

          char frontChar= sb.charAt(front) ;
          char backChar = sb.charAt(back);

          sb.setCharAt(front, backChar);
          sb.setCharAt(back, frontChar);
      }
      System.out.println(sb);
    }
}