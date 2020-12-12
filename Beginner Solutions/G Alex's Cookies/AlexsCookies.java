public class AlexsCookies{
   public static void main(String[]args){
   
   System.out.println(shareCookies(23));
   }
   public static String shareCookies(int cookies){
      if(cookies%2 == 0) return "Alex and Joey can share the cookies equally";
      return "Alex and Joey cannot share the cookies equally";
   }
}