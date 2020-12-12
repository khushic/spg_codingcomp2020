package JavaIntermediate;

public class GeorgesCalculator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int mode(int[] array) {
	    int mode = array[0];
	    int maxCount = 0;
	    for (int i = 0; i < array.length; i++) {
	        int value = array[i];
	        int count = 1;
	        for (int j = 0; j < array.length; j++) {
	            if (array[j] == value) count++;
	            if (count > maxCount) {
	                mode = value;
	                maxCount = count;
	            }
	        }
	    }
	    return mode;
	}

}
