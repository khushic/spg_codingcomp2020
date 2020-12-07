public class GeorgesWordScrambler{
   public static void main(String[]args){
      
   }
   public static void backwards(String str){
      for(int i=str.length(); i>0; i--){
         System.out.print(str.substring(i-1, i));
      }
      System.out.println();
   }
}