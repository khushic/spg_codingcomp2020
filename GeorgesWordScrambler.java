public class GeorgesWordScrambler{
   public static void main(String[]args){
      
      
   }
   public static String printBackwards(String str){
      String result = "";
      for(int i=str.length(); i>0; i--){
         result += str.substring(i-1, i);
      }
      return result;
   }
}