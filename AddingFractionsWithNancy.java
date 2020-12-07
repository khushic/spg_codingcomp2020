public class AddingFractionsWithNancy{
   public static void main(String[]args){
   
   }
   public static String addFrac(int num1, int denom1, int num2, int denom2){
      if(denom1 != denom2){
         int lcm = 0;
         for(int i=2; i<=denom1*denom2; i++){
            if(i % denom1 == 0 && i % denom2 == 0) lcm = i;
         } 
         return (num1*(lcm/denom1) + num2*(lcm/denom2)) + "/" + lcm;
      }
      else 
         return (num1 + num2) + "/" + denom1;  
   }
}