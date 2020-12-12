package JavaIntermediate;

public class AnnasWordScrambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public static void wordScrambler(String str){
		for (int i = 0; i < str.length(); i++) {
			for (int x = 0; x <= i; x++) {
				  System.out.print(str.charAt(x));
		    }
			System.out.println();
	    }
	}
	
}