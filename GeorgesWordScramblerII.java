public class GeorgesWordScramblerII{
   public static void main(String[]args){
   
   }
   public static String partOfString(String str, int start, int end){
      if(start>0 && end<str.length())
         return str.substring(start, end+1);
      else return null;
   }
}