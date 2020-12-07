public class AmysLetterSwapper{
   public static void main(String[]args){
   
   System.out.println(swap("good morning", 3, 9));
   }
   
   public static String swap(String str, int a, int b){
      String result = "";
      String temp = str.substring(a, a+1);
      for(int i=0; i<str.length(); i++){
         if(i==a) result += str.substring(b, b+1);
         else if(i==b) result += temp;
         else result += str.substring(i, i+1);
      } 
      return result;
   }
}