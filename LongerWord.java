public class LongerWord{
   public static void main(String[]args){
   
   }
   public static String longerWord(String str1, String str2){  
      if(str1.length() > str2.length()){
         return str1 + " " + str1.length();
      }
      else{
         return str2 + " " + str2.length();
      }
   }
   
}