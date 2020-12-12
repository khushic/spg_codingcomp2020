public class AmysAlarmClock{
   public static void main(String[]args){
   
   }
   public static String wakeUp(boolean winter, boolean vacation){
      if(winter && vacation) 
         return "12:00 pm";
      else if(!vacation) 
         return "7:00 am";
      else 
         return "11:00 am";
   }
}