public class GeorgesCalculator1{
   public static void main(String[]args){
   
	   int[] arr = {1,2,3,6};
	   System.out.println((range(arr)));
	   
   }
   public static int range(int[] arr){
      int max = arr[0], min = arr[0];
      for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max){ 
                 max = arr[i];
             }
             if (arr[i] < min){
                min = arr[i];
             }
      }
       
       return (max-min);
   }
}
