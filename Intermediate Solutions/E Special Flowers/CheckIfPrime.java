package JavaIntermediate;

public class CheckIfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public static boolean isPrime(int n) {
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true;
	}
}
