package JavaIntermediate;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public static int[] sort(int[] num) {
		int count = num.length;
		int temp;
		for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
		return num;
	}

}
