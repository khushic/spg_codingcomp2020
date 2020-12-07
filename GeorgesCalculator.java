public class GeorgesCalculator{
   public static void main(String[]args){
   
   }
   public static double calculator(double a, double b, String operation){
      if(operation.equals("+")) 
         return a+b;
      else if(operation.equals("-")) 
         return a-b;
      else if(operation.equals("*")) 
         return a*b;
      return a/b;
   }
}