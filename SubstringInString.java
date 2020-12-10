package JavaIntermediate;

public class SubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	public static int substringInString(String str, String findStr) {
		int lastIndex = 0, count = 0;
		while(lastIndex != -1){
		    lastIndex = str.indexOf(findStr,lastIndex);
		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		return count;
	}
}
