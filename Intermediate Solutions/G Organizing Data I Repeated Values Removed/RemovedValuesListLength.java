package JavaIntermediate;

public class RemovedValuesListLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public static int removeDuplicateElements(int arr[]){
	    int n = arr.length;
        if (n==0 || n==1){
            return n;
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
}
