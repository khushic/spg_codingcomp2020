public class AmysTypingTricks{   
   public static void main(String[]args){
   }
   public static String spaces(String str){
      String result = "";
      for(int i=0; i<str.length(); i++){
         result += (str.substring(i, i+1) + " ");
      }
      return result; 
   } 
}