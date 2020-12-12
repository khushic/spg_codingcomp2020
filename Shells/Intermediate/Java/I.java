import java.util.Scanner;

public class I {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split(", ");
		int[] arr = new int[in.length];
		for(int i = 0; i < in.length; i++) {
			arr[i] = Integer.parseInt(in[i]);
		}
		System.out.println(mode(arr));
	}
	public static int mode(int[] array) {
		//TYPE CODE HERE
		return -1;
	}
}